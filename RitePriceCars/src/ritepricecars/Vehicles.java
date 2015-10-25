/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ritepricecars;

import java.io.IOException;

/**
 *
 * @author 1013403
 */
public abstract class Vehicles implements java.io.Serializable{
    
    //VARIABLES
    
    protected String theReg;
    protected String theManufacturer;
    protected String theModel;
    protected int theEngSize;
    protected double theCost;
    protected char soldOff = 'n';
    protected double saleValue;
    protected String theType;
    
    //CONSTRUCTORS
    
    public void createVehicle(String reg, String manftr, String mod, int engcc, double cost){
        
        theReg = reg;
        theManufacturer = manftr;
        theModel = mod;
        theEngSize = engcc;
        theCost = cost;
        
    }

    //METHODS
    //ACCESS MODIFIERS
    
    public String getReg(){
        return theReg;
    }
        
    public String getManufacturer(){
        return theManufacturer;
    }
    
    public String getModel(){
        return theModel;
    }
    
    public int getEngineSize(){
        return theEngSize;
    }
    
    public double getCost(){
        return theCost;
    }
    
    public double getSaleValue(){
        return saleValue;
    }
    
    public String getVehicleType(){
        return theType;
    }
    
    public void getDetails(){
        // empty modifier to be overwritten
    }
    
    //MUTATOR MODIFIERS
    
    public void changeDetails()throws IOException{
        // empty modifier to be overwritten
    }
    
    public void setReg(String reg){
            theReg = reg;
    }
    
    public void setManufacturer(String man){
        theManufacturer = man;
    }
    
    public void setModel(String mod){
        theModel = mod;
    }
    
    public void setEngine(int eng){
        theEngSize = eng;
    }
    
    public void setCost(double cst){
        theCost = cst;
    }
    
    public void setSoldOff(char sold){
        soldOff = sold;
    }
    
    public void setSaleValue(double sval){
        saleValue = sval;
    }
}