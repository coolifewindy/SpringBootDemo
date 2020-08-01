package com.example.chan.extra;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
    public static void main(String[] args) {
      /*  User user =new User();
        user.setName(UUID.randomUUID().toString());
        System.out.println(user.getName());

        Cache<String, Object> cache = Caffeine.newBuilder()
            .expireAfterWrite(1, TimeUnit.MINUTES)
            .maximumSize(100)
            .build();
*/

        System.out.println(new BCryptPasswordEncoder().encode("cl123456"));

    }
}
