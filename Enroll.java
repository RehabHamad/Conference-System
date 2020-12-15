/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gar_1808142_p5;



public abstract class Enroll implements Comparable<Enroll> {
    
    
    
protected String name; 
protected String address;
public Enroll(String name, String address) { 
    this.name = name;

this.address = address;
}  
    
   public Enroll() { this.name = ""; this.address = "";
} 
    
   public String getName() { return name;
} 
  
  public void setName(String name) { this.name = name;
}
public String getAddress() { return address;
}
public void setAddress(String address) { this.address = address;
} 
   
   
   
   
   
    
    
}
