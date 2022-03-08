package com.itacademy.collections.task2;

public class Student {
    private String name;
    private int age;
    private int grade;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", id=" + id +
                '}';
    }

    public Student(String name, int age, int grade, int id) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.id = id;
    }
}
