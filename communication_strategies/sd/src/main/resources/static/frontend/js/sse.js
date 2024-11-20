const eventSource = new EventSource('http://localhost:8080/api/sse');

eventSource.onmessage = function(event) {
    console.log('New message from server:', event.data);
};

eventSource.onerror = function(error) {
    eventSource.close();
    console.error('SSE error:', error);
};
