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
public class Professor extends Enroll {

    private int professorId;
    private double salary;
    private String prof_code;

    public Professor() {
        super();
    }

    Professor(String name, String address, int professorId, double salary) {
        super(name, address);
        this.salary = salary;
        this.professorId = professorId;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getProf_code() {
        return prof_code;
    }

    public void setProf_code(String prof_code) {
        this.prof_code = prof_code;
    }

    @Override
    public String toString() {
        return "Professor Details \n" + " Professor ID: " + getProfessorId() + ", Name: " + super.getName() + ", Address: " + super.getAddress() + ", Salary :" + getSalary() + "\n";
    }

    @Override
    public int compareTo(Enroll o) {
        Professor o1 = (Professor) o;
        return Integer.compare(getProfessorId(), o1.getProfessorId());
    }

 
 
    
    
}
