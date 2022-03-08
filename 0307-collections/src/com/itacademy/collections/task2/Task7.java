package com.itacademy.collections.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 78, 19));

        for (Integer element : list) {
            System.out.print(element + " ");
        }

        list.sort(Comparator.reverseOrder());

        System.out.println(" ");
        for (Integer element: list) {
            System.out.print(element + " ");
        }
    }
}
