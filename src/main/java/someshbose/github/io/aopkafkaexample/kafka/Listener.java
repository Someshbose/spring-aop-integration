package someshbose.github.io.aopkafkaexample.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Listener {

  @KafkaListener(id = "test", topics = "test-topic")
  public void listen(){
    log.info("Message consumed...");
  }
}
