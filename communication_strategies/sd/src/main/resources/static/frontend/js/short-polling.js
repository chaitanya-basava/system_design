const endpointUrl = 'http://localhost:8080/api/short-polling';
const pollingInterval = 1000; // Poll every 5 seconds

async function pollServer() {
    try {
        const response = await fetch(endpointUrl);
        const data = await response.text();
        console.log('Update received:', data);
    } catch (error) {
        console.error('Error fetching updates:', error);
    }
}

setInterval(pollServer, pollingInterval);