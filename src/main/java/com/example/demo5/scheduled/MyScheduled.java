package com.example.demo5.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author chenliang
 */
@Component
public class MyScheduled {
  /**
   * 引入该方法时需要在application启动类上加
   * @EnableScheduling注解
   */
  private static final Logger logger = LoggerFactory.getLogger(MyScheduled.class);
  @Scheduled(cron="0/5 * * * * *")
  public void cron(){
    logger.info(LocalDateTime.now().toString());
  }
}
