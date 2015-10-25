/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ritepricecars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 1013403
 */
public class Customers implements java.io.Serializable{
    
    // VARIABLES
    
    private static int lastCustNo; // a class variable
    private int custNo;
    private String firstName = "";
    private String lastName = "";
    private char gender = 'm';
    private String birthDate = "";
    private String licenseNo = "";
    
    // CONSTRUCTORS
    
    /**
     *
     * @param fname
     * @param lname
     * @param gend
     * @param dob
     * @param lcsno
     */
    public Customers(String fname, String lname, char gend, String dob, String lcsno){
        lastCustNo = lastCustNo + 1; // increases the class
        custNo = lastCustNo;
        firstName = fname;
        lastName = lname;
        gender = gend;
        birthDate = dob;
        licenseNo = lcsno;
    }
    
    // METHODS
    
    
    
    // ACCESS MODIFIERS
    
    public void getCustomer(){
        
        System.out.println();
        System.out.println("The Details for Customer No. \t\"" + getCustNo() + "\"\n");
        String title;
        if (gender == 'm'){
            title = "Mr.";
        }else{
            title = "Ms.";
        }
        System.out.println("Customer Name........\t\"" + title + " " + getFirstName() + " " + getLastName() + "\"");
        System.out.println("Born on..............\t\"" + getBirthDate() + "\"");
        System.out.println("Carries License No...\t\"" + getLicenseNo() + "\"");
        System.out.println();
        System.out.println("==============================================");
    }
    
    public int getLastCustNo(){
        return lastCustNo;
    }
    
    public int getCustNo(){
        return custNo;
    }
    
    public String getFirstName(){
        return firstName;
    }
        
    public String getLastName(){
        return lastName;
    }
    
    public char getGender(){
        return gender;
    }
    
    public String getBirthDate(){
        return birthDate;
    }
     
    public String getLicenseNo(){
        return licenseNo;
    }
    
    // MUTATOR MODIFIERS
    
    public void changeDetails() throws IOException {
        
        String fname = "";
        String lname = "";
        String gend = "";
        String dob = "";
        String lcsno = "";
        
        //note that you need to import the required classes from the 
        //Java io package - this goes at the top of the source document
        //import java.io.*;
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
        
        System.out.println("Customer Gender \t\"" + getGender() + "\"");
        System.out.println("Enter NEW Gender (m/f?): ");            
        gend = in.readLine();
        
        if(!(gend.equals(""))){
            char cgend = gend.charAt(0); // get first LC charachter of gender
            setGender(cgend);
        }
        
        System.out.println("Customer First Name \t\"" + getFirstName() + "\"");
        System.out.println("Enter NEW First Name: ");            
        fname = in.readLine();
        
        if(!(fname.equals(""))){
            setFirstName(fname);
        }
        
        System.out.println("Customer Suname \t\"" + getLastName() + "\"");
        System.out.println("Enter NEW Surname: ");            
        lname = in.readLine();
        
        if(!(lname.equals(""))){
            setLastName(lname);
        }
        
        System.out.println("Customer Date of Birth \t\"" + getBirthDate() + "\"");
        System.out.println("Enter NEW Date (dd/mm/yyyy): ");            
        dob = in.readLine();
        
        if(!(dob.equals(""))){
            setBirthDate(dob);
        }
        
        System.out.println("Customer License Number \t\"" + getLicenseNo() + "\"");
        System.out.println("Enter NEW License Number: ");            
        lcsno = in.readLine();
        
        if(!(lcsno.equals(""))){
            setLicenseNo(lcsno);
        } 
    }
    
    public void setFirstName(String fname){
        firstName = fname;
    }
    
     public void setLastName(String lname){
        lastName = lname;
    }
    
    public void setGender(char gend){
        gender = gend;
    }
    
    public void setBirthDate(String dob){
        birthDate = dob;
    }
    
    public void setLicenseNo(String lcsno){
        licenseNo = lcsno;
    }
}
