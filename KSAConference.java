/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gar_1808142_p5;

import java.util.ArrayList;

/**
 *
 * @author hamad
 */
public class KSAConference extends Enroll{
    private String conferenceTitle;
    private int roomNo;
    private int buildingNo;
    private String location;
    private ArrayList<Student> student = new ArrayList<Student>();
    private ArrayList<Professor> professor = new ArrayList<Professor>();
    private University university;
    private String conf_code;

    public KSAConference() {
    }

    public KSAConference(String conferenceTitle, int roomNo, int buildingNo, String location, double conferenceFees) {
        super(conferenceTitle, location);
        this.roomNo = roomNo;
        this.buildingNo = buildingNo;
    }
  
    public String getConferenceTitle() {
        return conferenceTitle;
    }

    public void setConferenceTitle(String conferenceTitle) {
        this.conferenceTitle = conferenceTitle;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getLocation() {
        return location;
    }
  
    public void setLocation(String location) {

        this.location = location;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student.add(student);
    }

    public ArrayList<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor.add(professor);
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
    
    public String getConf_code() {
        return conf_code;
    }

    public void setConf_code(String conf_code) {
        this.conf_code = conf_code;
    }

    @Override
    public String toString() {
        String data = "-- Following Students are registered in the conference ---" + System.getProperty("line.separator");
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getName() != null) {
                data += student.get(i).toString() + System.getProperty("line.separator");
            }
        }
        data += "--- Following Professors are registered in the conference ---" + System.getProperty("line.separator");
        for (int i = 0; i < professor.size(); i++) {
            if (!(professor.get(i).getName().equals(""))) {
                data += professor.get(i).toString() + System.getProperty("line.separator");
            }
        }
        if ((university != null)) {
            data += " **** above Conference will be held in the following university **** \n";

            data += university.toString();
        }
        return "Conference Title: " + getConferenceTitle() + ", Room No: " + roomNo + " " + ", Building No :" + getBuildingNo() + " " + ", location No :" + getLocation() + System.getProperty("line.separator")
                + data;
    }
//TODO
// the comparison is according to location of conference

    @Override
    public int compareTo(Enroll o) {
        KSAConference o1 = (KSAConference) o;
        return getLocation().compareTo(o1.getLocation());
    }
  
    
    
    
    
    
    
    
}
