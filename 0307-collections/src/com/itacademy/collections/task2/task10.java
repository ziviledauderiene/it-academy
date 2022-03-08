package com.itacademy.collections.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task10 {
    public static void main(String[] args) {
        Student a = new Student("Jonas", 25, 5, 111);
        Student b = new Student("Ponas", 23, 4, 222);
        Student c = new Student("Ponas", 21, 4, 333);
        Student d = new Student("Ponas", 24, 3, 444);
        Student e = new Student("Titas", 27, 1, 555);

        List<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);
        students.add(e);

        students.stream().forEach(student -> student.setGrade(10));

        for (Student student:students){
            System.out.println(student);
        }

        List<Student> notPonas = students.stream().filter(student -> !student.getName().equals("Ponas")).toList();
        System.out.println(" ");

        for (Student student:notPonas){
            System.out.println(student);
        }
    }
}
