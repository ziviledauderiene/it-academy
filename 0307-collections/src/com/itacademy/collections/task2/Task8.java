package com.itacademy.collections.task2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        Student a = new Student("Jonas", 25, 5, 111);
        Student b = new Student("Ponas", 23, 4, 222);
        Student c = new Student("Pižonas", 21, 4, 333);
        Student d = new Student("Tas", 24, 3, 444);
        Student e = new Student("Titas", 27, 1, 555);

        List<Student> students = Arrays.asList();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);
        students.add(e);

        Collections.sort(students, new AgeComparator().reversed());

        for (Student student: students) {
            System.out.println(student);
        }

    }

}
