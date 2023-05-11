package com.basava.builder_pattern;

import com.basava.builder_pattern.builder.EngineeringStudentBuilder;
import com.basava.builder_pattern.builder.ManagementStudentBuilder;

public class Main {
    public static void main(String[] args) {
        Student engineeringNetworkingStudent = new EngineeringStudentBuilder(115)
                .setName("Chaitanya")
                .setCourse("CSE")
                .setSubjects("Networking")
                .build();

        Student managementSalesStudent = new ManagementStudentBuilder(1)
                .setName("Chaitanya (2)")
                .setCourse("MBA")
                .setSubjects("Sales")
                .build();

        System.out.println(engineeringNetworkingStudent);
        System.out.println(managementSalesStudent);
    }
}
