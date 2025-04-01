package com.kevin.scenarios.exception.courseenrollment;

public class Student {
    protected String name;
    protected int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Method of enroll
    public void enroll(String courseName) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("Enrollment failed " + name + " must be of 18 ");
        } else {
            System.out.println(name + " Successfully enrolled in " + courseName);
        }
    }
}

class PremiumStudent extends Student {
    public PremiumStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void enroll(String courseName) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("Premium Enrollment failed " + name + " must be of 18 ");
        } else {
            System.out.println(name + " Successfully Premium enrolled in " + courseName);
        }
    }
}


