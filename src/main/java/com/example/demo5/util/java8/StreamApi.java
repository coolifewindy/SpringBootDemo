package com.example.demo5.util.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        Random random = new Random();
        random.doubles();
        random.longs();
        //没有参数就生成无限多个，这三种都是jdk1.8加的方法
        // 有1个参数就生成参数个数，
        // 有2个参数则是生成参数范围内的值[a,b)包含前参数不包含后参数
        //有3个参数的话则是第一个参数是生成数个数，第二个是开始值，第三个是结束值
        random.ints(0,100).limit(10).forEach(System.out::println);
        random.doubles(3,3,7).sorted()
                .forEach(System.out::println);
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
// 获取空字符串的数量
        long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        strings.stream().map(String::toUpperCase).forEach(System.out::println);
        List<String> list = strings.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(count);

        //list1.stream().map()


    }
    }

