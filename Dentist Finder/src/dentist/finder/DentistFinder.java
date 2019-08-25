/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentist.finder;

import java.util.ArrayList;

/**
 *
 * @author FarisAbu3ram
 */
public class DentistFinder {
     
   User user = new User.UserBuilder().build();
ArrayList <Address> add= new ArrayList <Address> ();
        String Specialize;
    ArrayList <Speciality> spec=new ArrayList<Speciality>();
    ArrayList <Education> edu=new ArrayList <Education>();

    public void setSpec(ArrayList<Speciality> spec) {
        this.spec = spec;
    }

    public ArrayList<Speciality> getSpec() {
        return spec;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Address> getAdd() {
        return add;
    }

    public ArrayList<Education> getEdu() {
        return edu;
    }

    public void setAdd(ArrayList<Address> add) {
        this.add = add;
    }

    public void setSpecialize(String Specialize) {
        this.Specialize = Specialize;
    }

    public void setEdu(ArrayList<Education> edu) {
        this.edu = edu;
    }

    public User getUser() {
        return user;
    }

    

  

    public String getSpecialize() {
        return Specialize;
    }

    public DentistFinder(User user ,ArrayList <Education> edu, ArrayList <Address> add,String Specialize,ArrayList <Speciality> spec) {
        this.user=user;
        this.edu=edu;
        this.add=add;
        this.Specialize=Specialize;
        this.spec=spec;
    }
    
    
    
}
