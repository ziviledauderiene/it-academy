package com.itacademy.collections.task2;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Student a = new Student("Jonas", 25, 5, 111);
        Student b = new Student("Ponas", 23, 4, 222);
        Student c = new Student("Pižonas", 21, 4, 333);
        Student d = new Student("Tas", 24, 3, 444);
        Student e = new Student("Titas", 27, 1, 555);
//
//        Map<Integer, Student> map = new HashMap<>();
//        map.put(1, a);
//        map.put(2, b);
//
//        System.out.println(map);
//
//        map.get(2).setGrade(10);
//        System.out.println(map);

        List<Student> students = Arrays.asList(a, b, c, d, e);
        Map<Integer, Student> map = new HashMap<>();
        for (Student student: students) {
            map.put(student.getId(), student);
        }
        map.get(444).setGrade(5);
        map.get(444).setAge(5);

        for (Map.Entry<Integer, Student> student: map.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }

    }
}
