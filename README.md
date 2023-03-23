# kafka-quickstart
## This Kafka App Consists of:
- Topics
- Producers 
- Consumers
## App's Job: 
- To print out the message that was sent from a post request
## Requirements
- You need to Install Kafka. Use this link If you are using windows: https://www.geeksforgeeks.org/how-to-install-and-run-apache-kafka-on-windows/
## APIs
### The Only POST Request:
- Path: /api/v1/messages
- Body: {
    "message": "This message was sent from a post request"
}
