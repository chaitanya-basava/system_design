package communication.strategies.sd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
@RequestMapping("/api")
public class CommController {
    private final ScheduledTask scheduledTask;

    CommController(@Autowired ScheduledTask scheduledTask) {
        this.scheduledTask = scheduledTask;
    }

    @GetMapping("/short-polling")
    public ResponseEntity<String> getUpdates() {
        String update = scheduledTask.getValue();
        return ResponseEntity.ok(update);
    }

    // DeferredResult allows the server to free up the HTTP worker thread while waiting
    // for a long-running process to complete.
    // The HTTP connection remains open, but no thread is blocked.
    @GetMapping("/long-polling")
    public DeferredResult<ResponseEntity<String>> getUpdatesLongPolling() {
        DeferredResult<ResponseEntity<String>> deferredResult = new DeferredResult<>(100000L);
        new Thread(() -> {
            String update = null;
            while(update == null) {
                update = scheduledTask.getValue();
            }
            deferredResult.setResult(ResponseEntity.ok(update));
        }).start();

        return deferredResult;
    }

    @GetMapping(path = "/sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public SseEmitter getUpdatesSse() {
        ExecutorService executor = Executors.newCachedThreadPool();
        SseEmitter emitter = new SseEmitter(Long.MAX_VALUE); // Long-lived connection
        executor.execute(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    String update = null;
                    while(update == null) {
                        update = scheduledTask.getValue();
                    }
                    emitter.send(update);
                }
                emitter.complete();
            } catch(IOException e) {
                emitter.completeWithError(e);
            } finally {
                executor.shutdown();
            }
        });

        emitter.onError(e -> {
            System.out.println("Error occurred: " + e.getMessage());
            emitter.completeWithError(e);
        });

        return emitter;
    }
}
