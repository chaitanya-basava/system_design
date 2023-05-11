package com.basava.builder_pattern.builder;

import java.util.List;
import java.util.ArrayList;

public class EngineeringStudentBuilder extends StudentBuilder {
    public EngineeringStudentBuilder(long rollNumber) {
        this.setRollNumber(rollNumber);
    }

    @Override
    public StudentBuilder setSubjects(String elective) {
        List<String> subs = new ArrayList<>();
        subs.add("DSA");
        subs.add("OS");
        subs.add("Computer Architecture");
        subs.add(elective);
        this.subjects = subs;

        return this;
    }
}
