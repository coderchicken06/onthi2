/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Customer {
    private String CustomerId;
    private String fullname;
    private boolean gender;
    private Date dateOfBirth;
    private String address;
    private String phoneNumber;
    private String email;
    
    

    // Constructor, getters, setters...

    public Customer() {
    }

    public Customer(String id, String fullname, boolean gender, Date dateOfBirth, String address, String phoneNumber, String email) {
        this.CustomerId = id;
        this.fullname = fullname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return CustomerId;
    }

    public void setId(String id) {
        this.CustomerId = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public  Object[] Row(){
        return new Object[]{
        CustomerId, fullname, gender, dateOfBirth, address, phoneNumber, email
    };
   
}
}

