package communication.strategies.sd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

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

    @GetMapping("/long-polling")
    public DeferredResult<ResponseEntity<String>> getUpdatesLongPolling() {
        DeferredResult<ResponseEntity<String>> deferredResult = new DeferredResult<>(10000L);
        new Thread(() -> {
            String update = null;
            while(update == null) {
                update = scheduledTask.getValue();
            }
            deferredResult.setResult(ResponseEntity.ok(update));
        }).start();

        return deferredResult;
    }
}
