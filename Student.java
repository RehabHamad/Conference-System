/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gar_1808142_p5;

/**
 *
 * @author hamad
 */
public class Student extends Enroll {

    private int studentId;
    private double gpa;
    private String student_code;

    public Student() {
        super();
    }

    Student(String name, String address, int studentId, double gpd) {
        super(name, address);
        this.gpa = gpa;
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getStudent_code() {
        return student_code;
    }

    public void setStudent_code(String student_code) {
        this.student_code = student_code;
    }

    @Override
    public String toString() {
        return "Student Details \n" + " Student ID: " + getStudentId() + ", Name: " + super.getName() + ", GPA :" + getGpa() + ", Address: " + super.getAddress() + "\n";
    }

    @Override
    public int compareTo(Enroll o) {
        Student o1 = (Student) o;
        return Integer.compare(getStudentId(), o1.getStudentId());
    }










    
    
}
