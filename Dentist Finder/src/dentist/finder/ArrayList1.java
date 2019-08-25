/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentist.finder;

/**
 *
 * @author FarisAbu3ram
 */
import java.util.ArrayList;

public  class  ArrayList1 {
    private static ArrayList <Speciality>special;

    public static  ArrayList<Speciality> getSpecial() {
        return special;
    }
 
    public  ArrayList1(ArrayList<Speciality> special) {
        this.special = special;
    }

    public  void setSpecial(ArrayList<Speciality> special) {
        this.special = special;
    }
  
   
}