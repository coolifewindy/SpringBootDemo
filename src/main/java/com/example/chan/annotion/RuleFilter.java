package com.example.chan.annotion;

import java.lang.annotation.*;

/**
 * @author chenliang
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RuleFilter {
  String value();
}
