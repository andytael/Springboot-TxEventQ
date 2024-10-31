package demo.atael.sbtxeventq.producer.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.jms.core.JmsTemplate;

@Service
public class Producer {

  JmsTemplate jmsTemplate;

  @Value("${txeventq.topic.name}")
  private String topic;

  public Producer(JmsTemplate jmsTemplate) {
    this.jmsTemplate = jmsTemplate;
  }

  public void sendMessageToTopic(String message)
  {
    jmsTemplate.convertAndSend(topic,message);
  }

}
