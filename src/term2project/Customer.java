/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term2project;

import java.util.ArrayList;

/**
 *
 * @authors
 * AJ_Wiese_21049612
 * TT_Mzwakali_216194350
 * 
 */
public class Customer 
{
    
    //ArrayList<Customer> cust = new ArrayList(10);
    
    private String firstName;
    private String surname;
    private String phoneNum;
    private double credit = 100.00;
    private boolean canRent;
    
    public Customer()
    {
    }
    
    public Customer(String fName, String sName, String phone, double credAmt, boolean can)
    {
        setFirstName(fName);
        setSurname(sName);
        setPhoneNum(phone);
        setCredit(credAmt);
        setCanRent(can);
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public boolean canRent() {
        return canRent;
    }

    public void setCanRent(boolean canRent) {
        this.canRent = canRent;
    }
    
    public String toString()
    {
        return " Name:\t\t" +firstName+ "\n  Surname:\t\t" +surname+ "\n  Phone Number:\t" +phoneNum+ "\n  Credit: \t\tR" +credit+ "\n  Can rent a DVD?:\t" +canRent+"\n\n";
    }
    
    
}
