package com.example.demo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-23 10:46
 * @Description:
 */
public class LambdaTest {
    interface Math{
        int operate(int a,int b);
    }
    @Test
    public void testPlus(){
        Math plus=(a,b)->a-b;
        System.out.println(plus.operate(1, 2));
    }

    @Test
    public void testPlus1(){
        List<String> languages = Arrays.asList("java","scala","python");
        //before java8
        for(String each:languages) {
            System.out.println(each);
        }
        System.out.println("=====");
        languages.forEach(a-> System.out.println(a));
        languages.forEach(System.out::println);

    }

    @Test
    public void testMap(){
        List<Double> cost=Arrays.asList(1.2,2.5,4.5);
        cost.stream().map(x->x+1).forEach(x-> System.out.println(x));
    }
}
