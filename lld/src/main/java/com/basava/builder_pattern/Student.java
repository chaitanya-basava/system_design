package com.basava.builder_pattern;

import com.basava.builder_pattern.builder.StudentBuilder;

import java.util.List;

public class Student {
    private final String name;
    private final String course;
    private final long rollNumber;
    private final List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.getName();
        this.course = studentBuilder.getCourse();
        this.rollNumber = studentBuilder.getRollNumber();
        this.subjects = studentBuilder.getSubjects();
    }

    public String toString(){
        return "roll number: " + this.rollNumber +
                " name: " + this.name +
                " course: " + this.course +
                " subjects: " + String.join(", ", subjects);
    }

}
