package com.example.chan.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenliang
 */
@Service("Check")
public class ApiFilter {
        public boolean hasRule(String rule){
            List<Object> list = new ArrayList<>();
            list.add("zhangsan");
            boolean bool = list.stream().anyMatch(x -> x.equals(rule));
            return bool;
        }
}
