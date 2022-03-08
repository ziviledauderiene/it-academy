package com.itacademy.collections.task3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<String> carNames = Arrays.asList("Subaru", "Bmw", "Suzuki", "Subaru");
//        Set<String> uniqueCarNames = new HashSet<>(carNames);
//        uniqueCarNames.addAll(carNames);
//
//
//        for (String carName: uniqueCarNames) {
//            System.out.println(carName);
//        }
//
//        Set<String> uniqueCarNamesTree = new TreeSet<>(uniqueCarNames);
//        System.out.println(" ");
//        for (String carName: uniqueCarNamesTree) {
//            System.out.println(carName + " ");
//        }

        List<String> fruits = Arrays.asList("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple");
        System.out.println(fruits.toArray().length);

        Set<String> uniqueFruits = new HashSet<>(fruits);

        for (String fruit: uniqueFruits) {
            System.out.println(fruit);
        }

        System.out.println(uniqueFruits.toArray().length);

    }
}
