package com.basava.prototype_pattern;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jan Doe", 30, "Dallas, TX");
        System.out.println(student);

        Student studentClone = (Student) student.clone();
        System.out.println(studentClone);
    }
}
