package com.itacademy.collections.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        Optional<String> a = list.stream().findFirst();
        System.out.println(a.get());


    }
}
