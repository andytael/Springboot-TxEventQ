package demo.atael.sbtxeventq.producer.controller;

import demo.atael.sbtxeventq.producer.service.Producer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageController {
  Producer producer;

  public MessageController(Producer producer) {
    this.producer = producer;
  }

  @PostMapping("/message")
  public String receiveMessage(@RequestParam("message") String message) {
    producer.sendMessageToTopic(message);
    return "Message was sent successfully";
  }
}
