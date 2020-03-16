# Kafka Example Sender/Receiver

* The main idea of this project is study Kafka with Sring.
* The use case is a high reliability message processor.
* It receive a message publish on a kafka Topic and than consume the message.

I am following this  [article](https://codenotfound.com/spring-kafka-consumer-producer-example.html)

## How to test

* Start the Kafka broker (https://kafka.apache.org/quickstart)
* Start the application
* Make a Get request to this URL: http://localhost:8080/msg/Leo
* The console should print:

"sending payload='Hello, Leo!'" 
"received payload='Hello, Leo!'"
