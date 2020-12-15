//Written by : Rehab Hamad

// Program for  KSA Conference System
//*****************************************************
package gar_1808142_p5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;


public class GAR_1808142_p5 {

    public static void main(String[] args) throws FileNotFoundException {

        String choice;

        File fi = new File("fcitInput.txt");

        if (!fi.exists()) {
            System.out.println("Input file, " + fi + ", does not exist.");
            System.exit(0);
        }

        // Output File:
        File outputFile = new File("fcitOutPutLab.txt");
// Make Scanner for input and Printwriter for output 
        Scanner input = new Scanner(fi);

        PrintWriter output = new PrintWriter(outputFile);

        KSAConference tempConference = null; // temp Conference reference used when adding Conference records
        Student tempStudent = null; // temp Student reference used when adding Student records
        Professor tempProfessor = null; // temp Professor reference used when adding Professor records
        University tempUniversity = null; // temp University reference used when adding University records

        output.println("Welcome to the KSA Conference System.");
        output.println("Today Date is " + (new Date()));
        output.println();

        ArrayList<Enroll> BigArray = new ArrayList<>(); 

        do {
            choice = input.next();

            // Command ADDRECORD: Add a new Conference record 
            if (choice.equals("Add_Conference") == true) {
            tempConference = new KSAConference();

            int addindex = enrollAny(tempConference, BigArray, input);
        } // outer if ends here
else if (choice.equals("Add_University") == true) {
                    tempUniversity = new University();
                    int addindex = enrollAny(tempUniversity, BigArray, input);

                }// outer if ends here
                else if (choice.equals("Add_Student") == true) {
                    tempStudent = new Student();
                    int addindex = enrollAny(tempStudent, BigArray, input);

                }// outer if ends here
                else if (choice.equals("Add_Professor") == true) {
                    tempProfessor = new Professor();
                    int addindex = enrollAny(tempProfessor, BigArray, input);

                }// outer if ends here
                else if (choice.equals("Add_Student_Conference") == true) { //add student to conference
                    int cindex = -1, sindex = -1; // index to be searched for assigning 
                    String ccode = input.next(); // conference code
                    String scode = input.next();// student code
                    for (int i = 0; i < BigArray.size(); i++) {
                        if (BigArray.get(i) instanceof KSAConference) {
                            if (((KSAConference) BigArray.get(i)).getConf_code().equals(ccode)) {
                                cindex = i;
                            }
                        }

                        if (BigArray.get(i) instanceof Student) {
                            if (((Student) BigArray.get(i)).getStudent_code().equals(scode)) {
                                sindex = i;
                            }
                        }
                    }

                    ((KSAConference) BigArray.get(cindex)).setStudent((Student) BigArray.get(sindex));
                    output.println("************************************************************** ************************************************");
                    output.println("Command: Add_Student_Conference");
                    output.println();
                    output.println(((Student) BigArray.get(sindex)).getName() + " has been Added in ");
                    output.print(((KSAConference) BigArray.get(cindex)).getConferenceTitle() + " ," + ((KSAConference) BigArray.get(cindex)).getLocation());
                    output.println();
                } // add professor to conference
                else if (choice.equals("Add_Professor_Conference") == true) { // Professor
                    int cindex = -1, pindex = -1; // index to be searched for assigning 
                    String ccode = input.next(); // conference code
                    String pcode = input.next();// professor code
                    for (int i = 0; i < BigArray.size(); i++) {
                        if (BigArray.get(i) instanceof KSAConference) {
                            if (((KSAConference) BigArray.get(i)).getConf_code().equals(ccode)) {
                                cindex = i;
                            }
                        }
                        if (BigArray.get(i) instanceof Professor) {
                            if (((Professor) BigArray.get(i)).getProf_code().equals(pcode)) {
                                pindex = i;
                            }
                        }

                    }
                    ((KSAConference) BigArray.get(cindex)).setProfessor((Professor) BigArray.get(pindex));
                    output.println("************************************************************** ************************************************");
                    output.println("Command: Add_Professor_Conference");
                    output.println();
                    output.println(BigArray.get(pindex).getName() + " has been added in ");
                    output.print(((KSAConference) BigArray.get(cindex)).getConferenceTitle() + " ," + ((KSAConference) BigArray.get(cindex)).getLocation());
                    output.println();
                } // Add_Professor ends here
                else if (choice.equals("Add_University_Conference") == true) { // University
                    int cindex = -1, mindex = -1; // index to be searched for assigning 
                    String ccode = input.next(); // COnference code
                    String ucode = input.next();// University code
                    for (int i = 0; i < BigArray.size(); i++) {
                        if (BigArray.get(i) instanceof KSAConference) {
                            if (((KSAConference) BigArray.get(i)).getConf_code().equals(ccode)) {
                                cindex = i;
                            }
                        }
                        if (BigArray.get(i) instanceof University) {
                            if (((University) BigArray.get(i)).getUniv_code().equals(ucode)) {
                                mindex = i;
                            }
                        }
                    }
                    ((KSAConference) BigArray.get(cindex)).setUniversity((University) BigArray.get(mindex));
                    output.println("************************************************************** ************************************************");
                    output.println("Command: Add_University_Conference");
                    output.println();
                    output.println(BigArray.get(mindex).getName() + " has been added in ");
                    output.print(((KSAConference) BigArray.get(cindex)).getConferenceTitle() + " ," + ((KSAConference) BigArray.get(cindex)).getLocation());
                    output.println();
                    output.println();
                } // Add University ends here
                else if (choice.equals("List_Conference") == true) { // List_Conference
                    int cindex = -1; // index to be searched for assigning 
                    String ccode = input.next(); // Conference code
                    for (int i = 0; i < BigArray.size(); i++) {
                        if (BigArray.get(i) instanceof KSAConference) {
                            if (((KSAConference) BigArray.get(i)).getConf_code().equals(ccode)) {
                                cindex = i;
                            }
                        }
                    }
                    output.println("************************************************************** ************************************************");
                    output.println("Command: List_Conference");
                    output.println();

                    output.print(((KSAConference) BigArray.get(cindex)).getConferenceTitle() + " ," + ((KSAConference) BigArray.get(cindex)).getLocation());
                    output.println();
                    output.printf("%s", BigArray.get(cindex).toString());
                    output.println();
                } // List_Conference ends here
                else if (choice.equals("List_All_Conference") == true) { // List_All_Conference
                    output.println("************************************************************** ************************************************");
                    output.println("Command: List_All_Conference");
                    for (int i = 0; i < BigArray.size(); i++) {
                        if (BigArray.get(i) instanceof KSAConference) {
                            output.println("---------Conference No " + (i + 1) + " ---------");
                            output.println();
                            output.print(((KSAConference) BigArray.get(i)).getConferenceTitle() + " ," + ((KSAConference) BigArray.get(i)).getLocation());
                            output.println();
                            output.printf("%s", BigArray.get(i).toString());
                            output.println();
                        }
                    }
                } // Conference ends here //////////////////////////////////////////////////////
                else if (choice.equals("Compare") == true) { // Compare
                    output.println("************************************************************** ************************************************");

                    output.println("Command: Comparision");
                    output.println();
                    String p = input.next();
                    String p2 = input.next();
                    if (p.charAt(0) == 'c') {
                        if (CheckConference(p, BigArray).compareTo(CheckConference(p2, BigArray)) == 0) {
                            output.println("Equal");
                        } else if (CheckConference(p, BigArray).compareTo(CheckConference(p2, BigArray)) > 0) {
                            output.println(CheckConference(p, BigArray).toString());
                        } else {
                            output.println(CheckConference(p2, BigArray).toString());
                        }
                    }
                    if (p.charAt(0) == 's') {
                        if (CheckStudent(p, BigArray).compareTo(CheckStudent(p2, BigArray)) == 0) {
                            output.println("Equal");
                        } else if (CheckStudent(p, BigArray).compareTo(CheckStudent(p2, BigArray)) > 0) {
                            output.println(CheckStudent(p, BigArray).toString());
                        } else {
                            output.println(CheckStudent(p2, BigArray).toString());
                        }
                    }
                    if (p.charAt(0) == 'u') {
                        if (CheckUniversity(p, BigArray).compareTo(CheckUniversity(p2, BigArray)) == 0) {
                               
                     output.println("Equal");  
                        }
                    }

           
        else if(CheckUniversity(p,BigArray).compareTo(CheckUniversity(p2,BigArray))>0)
output.println(CheckUniversity(p,BigArray).toString()); else output.println(CheckUniversity(p2,BigArray).toString());

        if (p.charAt(0) == 'p') {
            if (CheckProfessor(p, BigArray).compareTo(CheckProfessor(p2, BigArray)) == 0) {
                output.println("Equal");
            } else if (CheckProfessor(p, BigArray).compareTo(CheckProfessor(p2, BigArray)) > 0) {
                output.println(CheckProfessor(p, BigArray).toString());
            } else {
                output.println(CheckProfessor(p2, BigArray).toString());
            }
        }
                }
        
        else if (choice.equals("Throw") == true) {
            output.println("************************************************************** ************************************************");

        }

        String ex1 = input.next();
        try {
            if (ex1.equals("ArithmeticException")) {
                throw new ArithmeticException();
            }
            if (ex1.equals("IllegalArgumentException")) {
                throw new IllegalArgumentException();
            }
            if (ex1.equals("Exception")) {
                throw new Exception();
            }
        } catch (ArithmeticException e) {
            output.println("Command: Exception java.lang.ArithmeticException");
        } catch (IllegalArgumentException e) {
            output.println("Command: Exception java.lang.IllegalArgumentException");
        } catch (Exception e) {
            output.println("Command: Exception java.lang.Exception");
        }
        
        }while (choice.equals("Quit") != true);
        
        output.close();

    }

// Method to enroll
    
public static int enrollAny(Enroll enroll, ArrayList<Enroll> arrayEnolls, Scanner input) {
        int addindex = -1;
        if (enroll instanceof KSAConference) {
            ((KSAConference) enroll).setConferenceTitle(input.next());
            ((KSAConference) enroll).setRoomNo(input.nextInt());
            ((KSAConference) enroll).setBuildingNo(input.nextInt());
            ((KSAConference) enroll).setLocation(input.next());
            ((KSAConference) enroll).setConf_code(input.next());
        } else if (enroll instanceof University) {
            ((University) enroll).setName(input.next());
            String city = input.next();
            ((University) enroll).setAddress(city);
            ((University) enroll).setUniv_code(input.next());
        } else if (enroll instanceof Student) {
            ((Student) enroll).setStudentId(input.nextInt());
            ((Student) enroll).setName(input.next());
            ((Student) enroll).setAddress(input.next());
            ((Student) enroll).setGpa(input.nextDouble());
            ((Student) enroll).setStudent_code(input.next());
        } else if (enroll instanceof Professor) {
            ((Professor) enroll).setProfessorId(input.nextInt());
            ((Professor) enroll).setName(input.next());
            ((Professor) enroll).setSalary(input.nextDouble());
            ((Professor) enroll).setAddress(input.next());
            ((Professor) enroll).setProf_code(input.next());
        }
        arrayEnolls.add(enroll);
        ++addindex;
        return addindex;
    }

    // Method to check
 
    
    
    
    
      public static Professor CheckProfessor(String r1, ArrayList<Enroll> arrayEnolls) {
        for (int i = 0; i < arrayEnolls.size(); i++) {
            if (arrayEnolls.get(i) instanceof Professor) {
                Professor k1 = (Professor) arrayEnolls.get(i);
                if (k1.getProf_code().compareTo(r1) == 0) {
                    return k1;
                }
            }
        }
        return null;
    }

    public static Student CheckStudent(String r1, ArrayList<Enroll> arrayEnolls) {
        for (int i = 0; i < arrayEnolls.size(); i++) {
            if (arrayEnolls.get(i) instanceof Student) {
                Student k1 = (Student) arrayEnolls.get(i);
                if (k1.getStudent_code().compareTo(r1) == 0) {
                    return k1;
                }
            }
        }
        return null;
    }

      public static KSAConference CheckConference(String r1, ArrayList<Enroll> arrayEnolls) {
        for (int i = 0; i < arrayEnolls.size(); i++) {
            if (arrayEnolls.get(i) instanceof KSAConference) {
                KSAConference k1 = (KSAConference) arrayEnolls.get(i);
                if (k1.getConf_code().compareTo(r1) == 0) {
                    return k1;
                }
            }
        }
        return null;
    }

    public static University CheckUniversity(String r1, ArrayList<Enroll> arrayEnolls) {
        for (int i = 0; i < arrayEnolls.size(); i++) {
            if (arrayEnolls.get(i) instanceof University) {
                University k1 = (University) arrayEnolls.get(i);
                if (k1.getUniv_code().compareTo(r1) == 0) {
                    return k1;
                }
            }
        }
        return null;
    }





}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

  
  
    






