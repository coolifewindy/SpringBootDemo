package com.example.demo5.util;

public class Fibonacci {
    public static void main(String[] args) {
       int result= getValue(6);
        System.out.println(result);
    }
    public static int getValue(int x){
        if(x == 1 || x == 2){
            return 1;
        }else {
            return getValue(x-1)+getValue(x-2);
        }
    }
}
