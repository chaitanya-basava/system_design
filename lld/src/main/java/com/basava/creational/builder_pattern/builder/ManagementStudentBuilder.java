package com.basava.creational.builder_pattern.builder;

import java.util.List;
import java.util.ArrayList;

public class ManagementStudentBuilder extends StudentBuilder {
    public ManagementStudentBuilder(long rollNumber) {
        this.setRollNumber(rollNumber);
    }
    @Override
    public StudentBuilder setSubjects(String elective) {
        List<String> subs = new ArrayList<>();
        subs.add("Micro Economics");
        subs.add("Business Studies");
        subs.add("Operations Management");
        subs.add(elective);
        this.subjects = subs;

        return this;
    }
}
