package com.itacademy.collections.task4;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> vardai = new HashMap<>();
        vardai.put(1, "Simas");
        vardai.put(2, "Tomas");
        vardai.put(3, "Romas");

        System.out.println(vardai);

        if(vardai.containsKey(3)){
            vardai.put(3, "Joana");
        }

        System.out.println(vardai);


        for (Map.Entry<Integer, String> vardas : vardai.entrySet()) {
            System.out.println(vardas.getKey() + " " + vardas.getValue());
        }
    }
}
