package com.autonomous.labs.edi.messaging;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

  private KafkaTemplate<String, String> simpleProducer;

  public MessageProducer(KafkaTemplate<String, String> simpleProducer) {
    this.simpleProducer = simpleProducer;
  }
  public void send(String message) {
    simpleProducer.send("edi-message-topic", message);
  }
}
