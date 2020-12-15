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
public class University extends Enroll {

    private String univ_code;

    public University() {
    }

    public University(String name, String location) {
        super(name, location);
    }

    public String getUniv_code() {
        return univ_code;
    }

    public void setUniv_code(String univ_code) {
        this.univ_code = univ_code;
    }

    @Override
    public String toString() {
        return "University Name: " + super.getName() + " , Address: " + super.getAddress() + "\n ";
    }

    @Override

    public int compareTo(Enroll o) {
        University o1 = (University) o;
        return getUniv_code().compareTo(o1.getUniv_code());
    }


    
    
}
