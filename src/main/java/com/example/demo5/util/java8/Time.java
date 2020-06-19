package com.example.demo5.util.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
       //1.日期、时间格式化
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH-mm-ss")));
       //2.日期、时间加减
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        date.plusDays(2);
        date.plusDays(-2);
        time.plusHours(3);
        time.plusHours(-3);
        //3.日期比较
        int i = date.compareTo(date.plusDays(2));
        time.isBefore(time.plusHours(2));
    }
}
