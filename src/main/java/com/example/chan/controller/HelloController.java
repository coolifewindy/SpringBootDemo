package com.example.chan.controller;

import com.example.chan.annotion.RuleFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    @RuleFilter(value="test")
    public String hello() {
        return "zhangsan";
    }

    @GetMapping("/helloword")
    @PreAuthorize("@Check.hasRule('lisi')")
    public String helloword() {
        return "lisi";
    }
}
