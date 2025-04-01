package com.kevin.scenarios.exception.courseenrollment;

public class CourseEnrollment {
    public static void main(String[] args) {
        Student student1 = new Student("A", 20);
        Student student2 = new Student("B", 16);
        PremiumStudent premiumStudent = new PremiumStudent("C", 22);

        try {
            student1.enroll("Java Programing");
            premiumStudent.enroll("FullStack Course");
            student2.enroll("Python");
        } catch (AgeRestrictionException exception) {
            System.out.println("Exception " + exception.getMessage());
        }
    }
}
