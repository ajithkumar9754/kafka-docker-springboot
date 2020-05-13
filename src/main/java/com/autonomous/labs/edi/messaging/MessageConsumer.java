package com.autonomous.labs.edi.messaging;



import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class MessageConsumer {
  @KafkaListener(id = "message-consumer", topics = "edi-message-topic")
  public void consumeMessage(String message) {
    System.out.println("Messages Recieved from uploaded Files: -->"+message);
  }
}
