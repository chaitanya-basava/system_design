package com.basava.creational.builder_pattern.builder;

import com.basava.creational.builder_pattern.Student;

import java.util.List;

public abstract class StudentBuilder {

    long rollNumber;
    String name;
    String course;
    List<String> subjects;

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public StudentBuilder setCourse(String course) {
        this.course = course;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    abstract public StudentBuilder setSubjects(String elective);

    public Student build() {
        return new Student(this);
    }

}

