async function longPoll() {
    try {
        const response = await fetch('http://localhost:8080/api/long-polling');
        const data = await response.text();
        console.log('Received data:', data);

        // Immediately send another request after receiving a response
        setTimeout(longPoll, 1000); // Send another request after 1 second
    } catch (error) {
        console.error('Error during long polling:', error);

        // Retry after some delay in case of an error
        setTimeout(longPoll, 10000); // Retry after 10 seconds
    }
}

// Start long polling
longPoll().then(r => {}).catch(e => {});
