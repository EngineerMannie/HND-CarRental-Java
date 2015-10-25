/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ritepricecars;

/**
 *
 * @author Martin
 */
public class Rentals implements java.io.Serializable{

    // VARIABLES
    
    private int rentalNumber;
    private static int lastRentalNo; // a class variable
    private int rentalCustomer;
    private String rentalVehTheReg;
    private String rentalStart;
    private int rentalDuration;
    private Controller theController;
    
    // CONSTRUCTORS
    
    public Rentals(Controller c,int rcust, String rreg, String rstart, int rdur){
        
        theController = c;
        rentalNumber = getNewRentalNo();
        rentalCustomer = rcust;
        rentalVehTheReg = rreg;
        rentalStart = rstart;
        rentalDuration = rdur;
    }
    
    // METHODS
    
    // ACCESS MODIFIERS
    
    public void getRentals(){
        System.out.println();
        System.out.println("The Rentals List Details\n");
        System.out.println("Rental Number \t\t\"" + getRentNo() + "\"");
        System.out.println("Customer Number \t\"" + getRentCustomer() + "\"");
        // find customer
        Customers c1 = theController.findCustomer(getRentCustomer());
        c1.getCustomer();
        System.out.println("Vehicle Reg. Number \t\"" + getRentVehicle() + "\"");
        // find vehicle details
        Vehicles v1 = theController.findCar(getRentVehicle());
        System.out.println("\nThe Vehicle you listed is..\n");
        v1.getDetails();
        System.out.println("Rental Start Date \t\"" + getRentStart() + "\"");
        System.out.println("The Rental Duration is \t\"" + getRentDuration() + "\" days.");
        System.out.println();
        double totalCost = (v1.getCost())* getRentDuration();
        System.out.println("The Total Rental Cost is \"£" + totalCost + "\"");
        System.out.println("===================================");
    }
    
    public Vehicles findCar(String regNo){
        return null;
    }
    
    public int getRentNo(){
        return rentalNumber;
    }
    
    private int getNewRentalNo(){
        lastRentalNo = lastRentalNo + 1; // increases the class
        int rnum = lastRentalNo;
        return rnum;
    }
    
    public int getRentCustomer(){
        return rentalCustomer;
    }
    
    public String getRentVehicle(){
        return rentalVehTheReg;
    }
    
    public String getRentStart(){
        return rentalStart;
    }
    
    public int getRentDuration(){
        return rentalDuration;
    }
    
    // MUTATOR MODIFIERS
    
    public void setRentCustomer(int rcust){
        rentalCustomer = rcust;
    }
    
    public void setRentVehicle(String rreg){
        rentalVehTheReg = rreg;
    }
    
    public void setRentStart(String rstart){
        rentalStart = rstart;
    }
    
    public void setRentDuration(int rdur){
        rentalDuration = rdur;
    }
    
}
