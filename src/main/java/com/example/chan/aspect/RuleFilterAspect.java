package com.example.chan.aspect;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RuleFilterAspect {

  private static final Logger logger = LoggerFactory.getLogger(RuleFilterAspect.class);

  @Pointcut("@annotation(com.example.chan.annotion.RuleFilter)")
  public void pointcut() {

  }

  @Before("pointcut()")
  public void doBefore() {
    logger.info("============进入Before============");
  }

  @Around("pointcut()")
  public void around() {
    logger.info("============进入around============");
  }

  @AfterReturning("pointcut()")
  public void AfterReturning() {
    logger.info("============AfterReturning============");
  }

  @After("pointcut()")
  public void deAfter() {
    logger.info("============进入After============");
  }
}
