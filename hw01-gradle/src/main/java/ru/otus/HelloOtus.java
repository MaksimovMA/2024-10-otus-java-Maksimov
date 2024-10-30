package ru.otus;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;


public class HelloOtus {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<List<Integer>> partitioned = Lists.partition(list, 2);
        System.out.println(partitioned);

    }
}
