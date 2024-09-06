/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TIEGO MFULOANE ST10345884
 */
public class Student {
     private String studentID;
    private String studentName;
    private int studentAge;
    private String studentEmail;
    private String studentCourse;

    public Student(String studentID, String studentName, int studentAge, String studentEmail, String studentCourse) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    @Override
    public String toString() {
        return "---------------------------------------------------------------\n"
                + "Student ID: " + studentID + "\n"
                + "Student Name: " + studentName + "\n"
                + "Student Age: " + studentAge + "\n"
                + "Student Email: " + studentEmail + "\n"
                + "Student Course: " + studentCourse + "\n"
                + "---------------------------------------------------------------";
    }
}

