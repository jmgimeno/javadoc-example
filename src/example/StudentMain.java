package example;

/*
 * File: StudentMain.java
 * ----------------------
 * Simple test of the Student class.
 */

import acm.program.CommandLineProgram;

public class StudentMain extends CommandLineProgram {

    public static void main(String[] args) {
        new StudentMain().start(args);
    }

    public void run() {
        Student diligentStudent = new Student("Hermione Granger", 314159);
        diligentStudent.setCredits(97);
        diligentStudent.setPaidUp(true);
        Student weakStudent = new Student("Vincent Crabbe", 271828);
        weakStudent.setCredits(17.5);
        weakStudent.setPaidUp(true);
        Student impoverishedStudent = new Student("Ron Weasley", 161803);
        impoverishedStudent.setCredits(32);
        testEligibility(diligentStudent);
        testEligibility(weakStudent);
        testEligibility(impoverishedStudent);
    }

    private void testEligibility(Student student) {
        String verb = (isEligibleToGraduate(student)) ? "is" : "is not";
        println(student + " " + verb + " eligible to graduate.");
    }

    private boolean isEligibleToGraduate(Student student) {
        return student.getCredits() >= Student.CREDITS_TO_GRADUATE
                && student.isPaidUp();
    }
}
