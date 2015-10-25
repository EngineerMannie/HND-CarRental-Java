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
public class SportsCar extends Vehicles{
    
    //VARIABLES
    private int theBhp;
    
    //CONSTRUCTORS
    
    public SportsCar(String regno, String manufacturer, String model, int engSize, double cost, int bhp){
        
        theReg = regno;
        theManufacturer = manufacturer;
        theModel = model;
        theEngSize = engSize;
        theCost = cost;
        theBhp = bhp;
        theType = "S";
    }
    
    //METHODS
    //ACCESS MODIFIERS
    
    public void setBhp(int bhp){
        theBhp = bhp;
    }
    
    public int getBhp(){
        return theBhp;
    }
    
    
    /**
     *
     */
    @Override
    public void getDetails(){
        System.out.println();
        System.out.println("The Details for Sports Car\n");
        System.out.println("Registration Number \t\"" + getReg() + "\"");
        System.out.println("Manufactuer is \t\t\"" + getManufacturer() + "\"");
        System.out.println("The Model is \t\t\"" + getModel() + "\"");
        System.out.println("The Engine Capacity is \t\"" + getEngineSize() + "\"cc.");
        System.out.println("The Cost is \t\t\"£" + getCost() + "\" per day.");
        System.out.println("The Broken Horses\t\"" + getBhp() +  "\" Broken Horses.");
        if(!(soldOff == 'n')){
            System.out.println("The Write Off Value was\t\"£" + getSaleValue() + "\"");
        }
        System.out.println();
    }
    
     
    //MUTATOR MODIFIERS
    
    @Override
   public void changeDetails()throws IOException{
        
        String reg = "";
        String man = "";
        String mod = "";
        String eng = "";
        String cst = "";
        String bhp = "";
        
        //note that you need to import the required classes from the 
        //Java io package - this goes at the top of the source document
        //import java.io.*;
        
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
            
        System.out.println("Registration Number \t\"" + getReg() + "\"");
        System.out.println("Enter NEW registration number: ");            
        reg = in.readLine();
        if(!(reg.equals(""))){
            setReg(reg);
        }

        System.out.println("Manufactuer is \t\t\"" + getManufacturer() + "\"");
        System.out.println("Enter NEW manufacturer: ");            
        man = in.readLine();
        if(!(man.equals(""))){
            setManufacturer(man);
        }
        
        System.out.println("The Model is \t\t\"" + getModel() + "\"");
        System.out.println("Enter NEW model: ");            
        mod = in.readLine();
        if(!(mod.equals(""))){
            setModel(mod);
        }
        
        System.out.println("The Engine Capacity is \t\"" + getEngineSize() + "\"cc.");
        System.out.println("Enter NEW engine size: ");            
        eng = in.readLine();
        
        System.out.println("The Cost is \t\t\"£" + getCost() + "\" per day.");
        System.out.println("Enter NEW rental cost: ");
        cst = in.readLine();

        
        System.out.println("The Broken Horses\t\"" + getBhp() +  "\" Broken Horses.");
        System.out.println("Enter BHP: ");
        bhp = in.readLine();
        
        //note that the bhp is stored in a variable of type String
        //we need to convert it to an int

        //create an object of the wrapper class Integer
        //using the overloaded constructor that takes a String
        
        if(!(eng.equals(""))){
            Integer intob1 = new Integer(eng);
            //get the int value of the Integer object    
            int ieng = intob1.intValue();
            setEngine(ieng);
        }
        
        if(!(cst.equals(""))){
            Double dubob = new Double(cst);
            //get the double value of the Double object    
            double dcst = dubob.doubleValue();
            setCost(dcst);
        }
        
        if(!(bhp.equals(""))){
            Integer intob2 = new Integer(bhp);
            //get the int value of the Integer object    
            int ibhp = intob2.intValue();
            setBhp(ibhp);
        }
        
   }
    
}