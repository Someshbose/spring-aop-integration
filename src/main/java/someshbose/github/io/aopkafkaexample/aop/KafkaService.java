package someshbose.github.io.aopkafkaexample.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class KafkaService {

  @Pointcut("@annotation(org.springframework.kafka.annotation.KafkaListener)")
  public void execute(){ }

  @Before(value = "execute()")
  public void publish(JoinPoint joinPoint){
    log.info("Hi I am kafka method.");
  }
}
