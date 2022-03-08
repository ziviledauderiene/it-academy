package com.itacademy.collections.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task11 {
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

        List<Student> sorted = students.stream().sorted(Comparator.comparingInt(Student::getAge)).toList();
        System.out.println(sorted);

        Optional<Student> minAgeStudent = students.stream().min(Comparator.comparingInt(Student::getAge));
        System.out.println(minAgeStudent);
    }
}
