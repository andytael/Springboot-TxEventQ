package demo.atael.sbtxeventq.consumer.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

  @JmsListener(destination = "${txeventq.topic.name}")
  public void receiveMessage(String message) {
    System.out.println(message);
  }
}
