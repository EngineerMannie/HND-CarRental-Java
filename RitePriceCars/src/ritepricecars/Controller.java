/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ritepricecars;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author 1013403
 */
public class Controller implements java.io.Serializable{   
    
    //VARIABLES
    
    //create vehicle ArrayList
    /**
     *
     */
    protected ArrayList<Vehicles> theCars = new ArrayList<>();
    //create customer ArrayList
    protected ArrayList<Customers> theCustomers = new ArrayList<>();
    //create Rentals ArrayList
    protected ArrayList<Rentals> theRentals = new ArrayList<>();
    
    //CONSTRUCTORS    
        
    public Controller() throws IOException{
        
        System.out.println("Controller started...\n");
        
        //createInitList();
        deSerializeRightPrice();
        System.out.println("History File Loaded.\n");
        System.out.println("=====================\n");
        doMenu();
        
        //OpeningJFrame ojf = new OpeningJFrame();
        //ojf.setController();
        //ojf.setVisible(true);
    
    }
 
    //METHODS
    
    private void doMenu() throws IOException{
        
            Scanner in = new Scanner(System.in); 
            
            boolean quit = false; 
            
            do {

                // print menu
                System.out.println("......MAIN MENU......"); 
                System.out.println("====================="); 
                System.out.println("1. Load Initial Data."); 
                System.out.println("2. Vehicles Menu."); 
                System.out.println("3. Customers Menu."); 
                System.out.println("4. Rentals Menu."); 
                System.out.println("5. Save File."); 
                System.out.println("0. Quit"); 
                System.out.println("====================="); 

                // handle user commands 

                
                int menuItem; 

                  System.out.print("Choose menu item: "); 
                  menuItem = in.nextInt(); 
                  switch (menuItem) { 
                  case 1: 
                        System.out.println("Item #1 - Load Initial Data.\n"); 
                        // do something... 
                        createInitList();
                        break; 
                  case 2: 
                        System.out.println("Item #2 - Vehicles Menu.\n"); 
                        // do something... 
                        doCarsMenu();
                        break; 
                  case 3: 
                        System.out.println("Item #3 - Customers Menu.\n"); 
                        // do something...
                        doCustomersMenu();
                        break; 
                  case 4: 
                        System.out.println("Item #4 - Rentals Menu.\n"); 
                        // do something... 
                        doRentalsMenu();
                        break; 
                  case 5: 
                        System.out.println("Item #5 - Save File.\n"); 
                        // do something... 
                        serializeRightPrice();
                        break; 
                  case 0:
                        serializeRightPrice();
                        quit = true; 
                        break; 
                  default: 
                        System.out.println("Invalid choice."); 
                  } 
            } while (!quit); 
            System.out.println("Bye-bye!"); 

    }
    
    private void doCarsMenu() throws IOException{
        
            Scanner in = new Scanner(System.in); 
            
            boolean vquit = false; 
            
            do {

                // print menu
                System.out.println("..........VEHICLES MENU.........."); 
                System.out.println("================================="); 
                System.out.println("1. Create New Sports Car."); 
                System.out.println("2. Create New Luxury Car."); 
                System.out.println("3. Create New Off Roader."); 
                System.out.println("4. List Cars Available."); 
                System.out.println("5. Edit Vehicle. Find by RegNo.");             
                System.out.println("6. Remove Vehicle. Find by RegNo.");
                System.out.println("7. List Cars Sold Off."); 
                System.out.println("0. Main Menu."); 
                System.out.println("================================="); 

                // handle user commands 

                
                int menuItem; 

                  System.out.print("Choose menu item: "); 
                  menuItem = in.nextInt(); 
                  switch (menuItem) { 
                  case 1: 
                        System.out.println("Item #1 - Create New Sports Car.\n"); 
                        // do something... 
                        createSC();
                        break; 
                  case 2: 
                        System.out.println("Item #2 - Create New Luxury Car.\n"); 
                        // do something...
                        createLC();
                        break; 
                  case 3: 
                        System.out.println("Item #3 - Create New Off Roader.\n"); 
                        // do something... 
                        createOR();
                        break; 
                  case 4: 
                        System.out.println("Item #4 - List Cars Available.\n"); 
                        // do something... 
                        listCars("A");
                        break; 
                  case 5: 
                        System.out.println("Item  #5 - Edit Veh. Find by RegNo.\n"); 
                        // do something... 
                        editCar();
                        break; 
                  case 6:
                        System.out.println("Item  #6 - Remove Veh. Find by RegNo.\n");
                        // do Something...
                        removeCar();
                        break;
                  case 7:
                        System.out.println("Item #7 - List Cars Sold Off.\n");
                        // do something...
                        listCarsSoldOff();
                        break;
                  case 0: 
                        serializeRightPrice();  
                        vquit = true; 
                        break; 
                  default: 
                        System.out.println("Invalid choice."); 
                  } 
            } while (!vquit); 
            System.out.println("Back to Main Menu.\n\n"); 

    }
    
    private void doCustomersMenu() throws IOException{
        
            Scanner in = new Scanner(System.in); 
            
            boolean cquit = false; 
            
            do {

                // print menu
                System.out.println("......CUSTOMERS MENU......."); 
                System.out.println("==========================="); 
                System.out.println("1. Create New Customer."); 
                System.out.println("2. List Customers Details.");
                System.out.println("3. Edit Customer by Surname"); 
                System.out.println("0. Main Menu"); 
                System.out.println("==========================="); 

                // handle user commands 

                
                int menuItem; 

                  System.out.print("Choose menu item: "); 
                  menuItem = in.nextInt(); 
                  switch (menuItem) { 
                  case 1:
                        System.out.println("Item  #1 - Create New Customer.\n");
                        // does Something...
                        createCustomer();
                        break;
                  case 2:
                        System.out.println("Item  #2 - List Customer Details.\n");
                        // does Something...
                        listCustomers();
                        break;
                  case 3:
                        System.out.println("Item  #3 - Edit Customer by Surname.\n");
                        // do Something...
                        findCustomer();
                        break;
                  case 0: 
                        serializeRightPrice();
                        cquit = true; 
                        break; 
                  default: 
                        System.out.println("Invalid choice."); 
                  } 
            } while (!cquit); 
            System.out.println("Back to Main Menu.\n\n"); 

    }
    
    private void doRentalsMenu() throws IOException{
        
            Scanner in = new Scanner(System.in); 
            
            boolean rquit = false; 
            
            do {

                // print menu
                System.out.println(".......RENTALS MENU......."); 
                System.out.println("=========================="); 
                System.out.println("1. Create New Rental."); 
                System.out.println("2. List Rental Details.");
                System.out.println("3. Edit Rental by IDnumber"); 
                System.out.println("0. Main Menu"); 
                System.out.println("=========================="); 

                // handle user commands 

                
                int menuItem; 

                  System.out.print("Choose menu item: "); 
                  menuItem = in.nextInt(); 
                  switch (menuItem) { 
                  case 1:
                        System.out.println("Item  #1 - Create New Rental.\n");
                        // do Something...
                        createRentals();
                        break;
                  case 2:
                        System.out.println("Item  #2 - List Rental Details.\n");
                        // do Something...
                        listRentals();
                        break;
                  case 3:
                        System.out.println("Item  #3 - Edit Rental by IDnumber.\n");
                        // do Something...
                        //editRentals();
                        break;
                  case 0:
                        serializeRightPrice();
                        rquit = true; 
                        break; 
                  default: 
                        System.out.println("Invalid choice."); 
                  } 
            } while (!rquit); 
            System.out.println("Back to Main Menu.\n\n"); 

    }
    
    //ACCESS MODIFIERS
    
    private void serializeRightPrice(){
        
        try{
            FileOutputStream fileOut = new FileOutputStream("rightprice.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut); 
            //out.writeObject(theController);
            out.writeObject(theCars); 
            out.writeObject(theCustomers); 
            out.writeObject(theRentals); 
            out.close(); 
            fileOut.close(); 
        }
        catch(IOException i){
            i.printStackTrace(); 
        }
    }
    
    private void deSerializeRightPrice(){
        
        try{
            FileInputStream fileIn = new FileInputStream("rightprice.ser"); 
            ObjectInputStream in = new ObjectInputStream(fileIn); 
            //theController = (ArrayList) in.readObject();
            theCars = (ArrayList) in.readObject(); 
            theCustomers = (ArrayList) in.readObject(); 
            theRentals = (ArrayList) in.readObject(); 
            in.close(); 
            fileIn.close(); 
        }
        catch(IOException i){
            i.printStackTrace(); 
            return; 
        }
        catch(ClassNotFoundException c) 
        { 
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        } 
    }

    public void listCars(String rvtype){
        
        //String rentVehType = rvtype;

        Iterator anIT = theCars.iterator();
        
        // do check if vehicle type A,S,L,C

        System.out.println("==========================\n");
        
        while(anIT.hasNext()){
            Vehicles aVehicle = (Vehicles)anIT.next();
            if (rvtype.equals("A")){
                if(aVehicle.soldOff == 'n'){
                        aVehicle.getDetails();
                    }
            } else {
                if (rvtype.equals(aVehicle.getVehicleType())){
                    if(aVehicle.soldOff == 'n'){
                        aVehicle.getDetails();
                    }
                 }
            }
        }
        System.out.println("==========================\n");
        System.out.println("........End of List.......\n");
        System.out.println("==========================\n");       
    }

    public void listCarsSoldOff(){
        
        Iterator anIT = theCars.iterator();

        System.out.println("==========================\n");
        
        while(anIT.hasNext()){
            Vehicles aVehicle = (Vehicles)anIT.next();
            if(aVehicle.soldOff == 'y'){
                aVehicle.getDetails();
            }
        }
        System.out.println("==========================\n");
        System.out.println("........End of List.......\n");
        System.out.println("==========================\n");
    }
    
    /**
     *
     * @return
     * @throws IOException
     */
    public Vehicles findCar() throws IOException{
        
        String inReg = "";
        String listReg = "";
        String yesNo = "";
        
        // Find car by regno ask for regno input
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
            
        System.out.println("Enter registration number: ");            
        inReg = in.readLine();
        //System.out.println("You entered reg number: " + inReg);
        
        // Check the list of the car reg entered
        
        Iterator anIT = theCars.iterator();
        
        // Check if list is empty
        boolean found = false;
        
        // Select & Display the details of the car entered by regno
        
        Vehicles aVehicle = null;
        
        while(anIT.hasNext()){
            aVehicle = (Vehicles)anIT.next();
            listReg = aVehicle.getReg();
            // System.out.println("\nThe Vehicle in listing is.." + listReg);
            // System.out.println("The Vehicle you entered is.." + inReg);
             if (listReg.equalsIgnoreCase(inReg)){
               //System.out.println("\nThe Vehicle you listed is..\n");
               aVehicle.getDetails();
               found = true;
               break;
            }
        }
        
        // If no car details found
        
        if (!found){
            System.out.println("\n..Can't find that RegNo..\n");
        }
        
        System.out.println(".....End of List.....\n");
        return aVehicle;
    }
    
    /**
     *
     * @param regno
     * @throws IOException
     */
    public Vehicles findCar(String regno){
        
        String inReg = regno;
        String listReg = "";
        
        // Check the list of the car reg entered
        
        Iterator anIT = theCars.iterator();
        
        // Select & Display the details of the car entered by regno
        
        Vehicles aVehicle = null;
        
        while(anIT.hasNext()){
            aVehicle = (Vehicles)anIT.next();
            listReg = aVehicle.getReg();
            
             if (listReg.equalsIgnoreCase(inReg)){
               break;
            }
        }
        return aVehicle;
    }
    
    public Customers findCustomer(int custNo){
        
        int listCust;
        
        Iterator anIT = theCustomers.iterator();
        
        Customers aCustomer = null;
        
        while(anIT.hasNext()){
            aCustomer = (Customers)anIT.next();
            listCust = aCustomer.getCustNo();
            
             if (listCust==custNo){
               break;
            }
        }
        return aCustomer;
    }
    
    public void listCustomers(){

        Iterator anIT = theCustomers.iterator();
        
        System.out.println("==============================================");
        
        boolean empty = false;
        if(!anIT.hasNext()){
            System.out.println("...The List is Empty...");
            empty = true;
        }
        
        while(anIT.hasNext()){
            Customers aCustomer = (Customers)anIT.next();
            aCustomer.getCustomer();
        }
        
        if (!empty){
            System.out.println(".....End of List.....\n");
        }
               
    }
    
    public void listRentals(){
        
        Iterator anIT = theRentals.iterator();
        
        System.out.println("===================================");
        
        boolean empty = false;
        if(!anIT.hasNext()){
            System.out.println("...The List is Empty...");
            empty = true;
        }
        
        while(anIT.hasNext()){
            Rentals aRental = (Rentals)anIT.next();
            aRental.getRentals();
        }
        
        if (!empty){
            System.out.println(".....End of List.....\n");
        }
        
        System.out.println("===================================");
    }
    
    //MUTATOR MODIFIERS
    
    private void createInitList(){
        
        //clear arraylists
        
        theCars.clear();
        theCustomers.clear();
        theRentals.clear();
        
        // create initial list for Vehicles Array List to hold
        
        String reg = "HXA238E";
        String man = "Hillman";
        String mod = "Imp";
        int ieng = 890;
        double dcst = 75.50;
        int ibhp = 65;
        
        SportsCar sc1 =  new SportsCar(reg, man, mod, ieng, dcst, ibhp);
        theCars.add(sc1);
        
        reg = "DSG486M";
        man = "Hillman";
        mod = "Avanger";
        ieng = 1500;
        dcst = 95.50;
        int iprc = 2750;
        
        LuxurySaloon ls1 =  new LuxurySaloon(reg, man, mod, ieng, dcst, iprc);
        theCars.add(ls1);
        
        reg = "L369PSC";
        man = "Land Rover";
        mod = "Discovery";
        ieng = 2500;
        dcst = 150.00;
        int igrs = 12;
                
        OffRoader or1 =  new OffRoader(reg, man, mod, ieng, dcst, igrs);
        theCars.add(or1);
        
        reg = "V4MNM";
        man = "Toyota";
        mod = "HiLux VX270";
        ieng = 2500;
        dcst = 150.00;
        igrs = 18;
                
        OffRoader or2 =  new OffRoader(reg, man, mod, ieng, dcst, igrs);
        theCars.add(or2);
        
        reg = "R177RSU";
        man = "Toyota";
        mod = "Land Cruiser";
        ieng = 3000;
        dcst = 175.00;
        igrs = 12;
                
        OffRoader or3 =  new OffRoader(reg, man, mod, ieng, dcst, igrs);
        theCars.add(or3);
        
        reg = "A200ASP";
        man = "Opel";
        mod = "Manta";
        ieng = 2000;
        dcst = 135.00;
        ibhp = 110;
        
        SportsCar sc2 =  new SportsCar(reg, man, mod, ieng, dcst, ibhp);
        theCars.add(sc2);
        
        reg = "M80MNU";
        man = "Audi";
        mod = "Cabriolet";
        ieng = 2600;
        dcst = 190.00;
        iprc = 32000;
        
        LuxurySaloon ls2 =  new LuxurySaloon(reg, man, mod, ieng, dcst, iprc);
        theCars.add(ls2);
        
        // create initial list for Customers Array List to hold
        
        String fname = "Martin";
        String lname = "Naismith";
        char cgend = 'm';
        String dob = "19/03/1959";
        String lcsno = "naism590319carfull";

        Customers cus1 = new Customers(fname, lname, cgend, dob, lcsno);
        theCustomers.add(cus1);
        
        fname = "Maggie";
        lname = "Macdonald";
        cgend = 'f';
        dob = "01/03/1961";
        lcsno = "macdon610301carfull";
        
        Customers cus2 = new Customers(fname, lname, cgend, dob, lcsno);
        theCustomers.add(cus2);
        
        fname = "Mickey";
        lname = "Mouuse";
        cgend = 'm';
        dob = "06/06/1946";
        lcsno = "mouse460606carfull";
        
        Customers cus3 = new Customers(fname, lname, cgend, dob, lcsno);
        theCustomers.add(cus3);
        
        fname = "Minnie";
        lname = "Mouse";
        cgend = 'f';
        dob = "08/08/1948";
        lcsno = "mouse480808carfull";
        
        Customers cus4 = new Customers(fname, lname, cgend, dob, lcsno);
        theCustomers.add(cus4);
        
        int rcust = 1;
        String rreg = "V4MNM";
        String rstart = "19/03/2012";
        int rdur = 14;
        
        Rentals rent1 = new Rentals(this,rcust, rreg, rstart, rdur);
        theRentals.add(rent1);
        
        rcust = 3;
        rreg = "M40GGE";
        rstart = "15/12/2012";
        rdur = 4;
        
        Rentals rent2 = new Rentals(this,rcust, rreg, rstart, rdur);
        theRentals.add(rent2);
        
        rcust = 4;
        rreg = "M40GGE";
        rstart = "23/12/2012";
        rdur = 6;
        
        Rentals rent3 = new Rentals(this,rcust, rreg, rstart, rdur);
        theRentals.add(rent3);
        
        rcust = 2;
        rreg = "R177RSU";
        rstart = "23/12/2012";
        rdur = 6;
        
        Rentals rent4 = new Rentals(this,rcust, rreg, rstart, rdur);
        theRentals.add(rent4);

    }
    
    /**
     *
     * @throws IOException
     */
     public void createSC() throws IOException{
        
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
            
        System.out.println("Enter registration number: ");            
        reg = in.readLine();
        
        System.out.println("Enter manufacturer: ");            
        man = in.readLine();
        
        System.out.println("Enter model: ");            
        mod = in.readLine();
        
        System.out.println("Enter engine size: ");            
        eng = in.readLine();
        
        System.out.println("Enter rental cost: ");            
        cst = in.readLine();
            
        System.out.println("Enter BHP: ");
        bhp = in.readLine();     
        
        //note that the bhp is stored in a variable of type String
        //we need to convert it to an int

        //create an object of the wrapper class Integer
        //using the overloaded constructor that takes a String
        
        Integer intob1 = new Integer(eng);
        //get the int value of the Integer object    
        int ieng = intob1.intValue();
        
        Double dubob = new Double(cst);
        //get the double value of the Double object    
        double dcst = dubob.doubleValue();
        
        Integer intob2 = new Integer(bhp);
        //get the int value of the Integer object    
        int ibhp = intob2.intValue();
        
        //add details to ArrayList
        SportsCar sc1 =  new SportsCar(reg, man, mod, ieng, dcst, ibhp);
        theCars.add(sc1);
     }
     
    /**
     *
     * @throws IOException
     */
    public void createLC() throws IOException{
        
        String reg = "";
        String man = "";
        String mod = "";
        String eng = "";
        String cst = "";
        String prc = "";
        
        //note that you need to import the required classes from the 
        //Java io package - this goes at the top of the source document
        //import java.io.*;
        
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
            
        System.out.println("Enter registration number: ");            
        reg = in.readLine();
        
        System.out.println("Enter manufacturer: ");            
        man = in.readLine();
        
        System.out.println("Enter model: ");            
        mod = in.readLine();
        
        System.out.println("Enter engine size: ");            
        eng = in.readLine();
        
        System.out.println("Enter rental cost: ");            
        cst = in.readLine();
            
        System.out.println("Enter the purchase price: ");
        prc = in.readLine();     
        
        //note that the price is stored in a variable of type String
        //we need to convert it to an int

        //create an object of the wrapper class Integer
        //using the overloaded constructor that takes a String
        
        Integer intob1 = new Integer(eng);
        //get the int value of the Integer object    
        int ieng = intob1.intValue();
        
        Double dubob = new Double(cst);
        //get the double value of the Double object    
        double dcst = dubob.doubleValue();
        
        Integer intob2 = new Integer(prc);
        //get the int value of the Integer object    
        int iprc = intob2.intValue();
        
        //add details to ArrayList
        LuxurySaloon ls1 =  new LuxurySaloon(reg, man, mod, ieng, dcst, iprc);
        theCars.add(ls1);
        
                
    }
    
    /**
     *
     * @throws IOException
     */ 
    public void createOR() throws IOException{
        
        String reg = "";
        String man = "";
        String mod = "";
        String eng = "";
        String cst = "";
        String grs = "";
        
        //note that you need to import the required classes from the 
        //Java io package - this goes at the top of the source document
        //import java.io.*;
        
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
            
        System.out.println("Enter registration number: ");            
        reg = in.readLine();
        
        System.out.println("Enter manufacturer: ");            
        man = in.readLine();
        
        System.out.println("Enter model: ");            
        mod = in.readLine();
        
        System.out.println("Enter engine size: ");            
        eng = in.readLine();
        
        System.out.println("Enter rental cost: ");            
        cst = in.readLine();
            
        System.out.println("Enter the number of gears: ");
        grs = in.readLine();     
        
        //note that the price is stored in a variable of type String
        //we need to convert it to an int

        //create an object of the wrapper class Integer
        //using the overloaded constructor that takes a String
        
        Integer intob1 = new Integer(eng);
        //get the int value of the Integer object    
        int ieng = intob1.intValue();
        
        Double dubob = new Double(cst);
        //get the double value of the Double object    
        double dcst = dubob.doubleValue();
        
        Integer intob2 = new Integer(grs);
        //get the int value of the Integer object    
        int igrs = intob2.intValue();
        
       //add details to ArrayList
        OffRoader or1 =  new OffRoader(reg, man, mod, ieng, dcst, igrs);
        theCars.add(or1);
        
    }
    
    public void editCar() throws IOException{

        String yesNo = "";

        // create wrapper class
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
       
        // Find car by regno ask for regno input
        Vehicles aVehicle = findCar();
        
        // Enter Details if require to be changed
        System.out.println("Do you want to change these details Y/N?...");
        yesNo = in.readLine();
        if(yesNo.equalsIgnoreCase("Y")){
            System.out.println("\n");
            aVehicle.changeDetails();
        }
                
    }
    
    public void removeCar() throws IOException{
        
        String yesNo = "";
        String sval = "";
        
        //Iterator anIT = theCars.iterator();

        // create inputstream reader
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
       
        // Find car by regno ask for regno input
        Vehicles aVehicle = findCar();
        
        // Delete Vehicle if Not in Stock
        
        System.out.println("Do you want to DELETE this Vehicle Y/N?...");
        yesNo = in.readLine();
        if(yesNo.equalsIgnoreCase("Y")){
            System.out.println();
            aVehicle.setSoldOff('y');
            System.out.println("Vehicle marked as Sold Off.\n");
            System.out.println("Enter the write off value for the vehicle.");
            sval = in.readLine();
            
            Double dubobj = new Double(sval);
            //get the double value of the Double object    
            double dsval = dubobj.doubleValue();
            
            aVehicle.setSaleValue(dsval);
        }
        
    }
    
    public void createCustomer() throws IOException{
        
        String fname;
        String lname;
        String gend;
        String dob;
        String lcsno;
        
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
        
        System.out.println("Enter Customer First Name: ");            
        fname = in.readLine();
        
        System.out.println("Enter Customer Surname Name: ");            
        lname = in.readLine();
        
        System.out.println("Enter Customer Gender (m/f): ");            
        gend = in.readLine();
        
        System.out.println("Enter Customer Date of Birth (dd/mm/yyyy): ");            
        dob = in.readLine();
        
        System.out.println("Enter Customer License Number: ");            
        lcsno = in.readLine();
        
        char cgend = gend.charAt(0); // get first LC charachter of gender
        
        Customers cus1 = new Customers(fname, lname, cgend, dob, lcsno);
        theCustomers.add(cus1);
        
    }
    
    public void findCustomer() throws IOException{
        
        String inSname = "";
        String listSname = "";
        String yesNo = "";
        
        // Find customer by Surname ask for Name input
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
            
        System.out.println("Enter Customer Surname: ");            
        inSname = in.readLine();
        System.out.println("You entered Surname: " + inSname);
        
        // Check the list of the Customers
        
        Iterator anIT = theCustomers.iterator();
        
        // Check if list is empty
        boolean found = false;
        
        // Select & Display the details of the customer
        
        Customers aCustomer = null;
        LinkedList list = new LinkedList();
        
        while(anIT.hasNext()){
            aCustomer = (Customers)anIT.next();
            listSname = aCustomer.getLastName();

            if(listSname.equalsIgnoreCase(inSname)){
                list.add(aCustomer);
                found = true;
            }
        }
        System.out.println("There are "+list.size()+" Customers found.");
        
        Iterator anIT2 = theCustomers.iterator();
        boolean editThis = false;
                
        while(anIT2.hasNext()){
            aCustomer = (Customers)anIT2.next();
            listSname = aCustomer.getLastName();
                        
            if(listSname.equalsIgnoreCase(inSname)){
                System.out.println("Is this the customer you wish to edit?");
                String title;
                if (aCustomer.getGender() == 'm'){
                    title = "Mr.";
                }else{
                    title = "Ms.";
                }
                System.out.println("Customer Name........\t\"" + title + " " + 
                    aCustomer.getFirstName() + " " + aCustomer.getLastName() + "\"");
                System.out.println("Change these details Y/N?...");
                yesNo = in.readLine();
                if(yesNo.equalsIgnoreCase("Y")){
                    System.out.println("\n");
                    editThis = true;
                    break;
                }
            }
            
        }
    }
        
    /**
     *
     * @return
     * @throws IOException
     */
    public Customers findCustomer2() throws IOException{
        
        String inSname = "";
        String listSname = "";
        String yesNo = "";
        
        // Find customer by Surname ask for Name input
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
            
        System.out.println("Enter Customer Surname: ");            
        inSname = in.readLine();
        System.out.println("You entered Surname: " + inSname);
        
        // Check the list of the Customers
        
        Iterator anIT = theCustomers.iterator();
        
        // Check if list is empty
        boolean found = false;
        
        // Select & Display the details of the customer
        
        Customers aCustomer = null;
        LinkedList list = new LinkedList();
        
        while(anIT.hasNext()){
            aCustomer = (Customers)anIT.next();
            listSname = aCustomer.getLastName();

            if(listSname.equalsIgnoreCase(inSname)){
                list.add(aCustomer);
                found = true;
            }
        }
        System.out.println("There are "+list.size()+" Customers found.");
        
        Iterator anIT2 = theCustomers.iterator();
        boolean editThis = false;
                
        while(anIT2.hasNext()){
            aCustomer = (Customers)anIT2.next();
            listSname = aCustomer.getLastName();
                        
            if(listSname.equalsIgnoreCase(inSname)){
                System.out.println("Is this the customer for the hire?");
                String title;
                if (aCustomer.getGender() == 'm'){
                    title = "Mr.";
                }else{
                    title = "Ms.";
                }
                System.out.println("Customer Name........\t\"" + title + " " + 
                    aCustomer.getFirstName() + " " + aCustomer.getLastName() + "\"");
                System.out.println("Record these details Y/N?...");
                yesNo = in.readLine();
                if(yesNo.equalsIgnoreCase("Y")){
                    break;
                }
            }
        }
        
        // If no customer details found
        if (!found){
            System.out.println("\n..Can't find Customer of that Surname..\n");
            System.out.println(".....End of List.....\n");
        }
        
        return aCustomer;
    }
    
    public void createRentals() throws IOException{
         //rcust,rreg,rstart,rdur
        
        String lname;
        int rcust;
        String rentvehtype;
        String rreg;
        String rstart;
        String rdur;
        
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
        
        System.out.println("Enter the Rental Details");
        System.out.println("========================\n");
        
        //System.out.println("Enter Customer Surname: ");            
        //lname = in.readLine();
        
        // do customer search
        Customers aCustomer = null;
        aCustomer = findCustomer2();
        rcust = aCustomer.getCustNo();     
        
        // do customer details
        aCustomer.getCustomer();
        
        // do vehicle type
        
        System.out.println("Enter Vehicle Type Required");
        System.out.println("S = Sports; L = Luxury; O = Offroad");
        boolean carType = false;

        do{
                  System.out.print("Choose vehicle Style Type; S L or O: "); 
                  rentvehtype = in.readLine();
                  
                  switch (rentvehtype) {
                  case "S": 
                        // do something... 
                        System.out.println("The List of Sports Cars Available");
                        System.out.println("=================================\n");
                        listCars("S");
                        carType = true;
                        break; 
                  case "L":
                        // do something...
                        System.out.println("The List of Luxury Saloons Available");
                        System.out.println("====================================\n");
                        listCars("L");
                        carType = true;
                        break; 
                  case "O": 
                        // do something...
                        System.out.println("The List of Off Roaders Available");
                        System.out.println("=================================\n");
                        listCars("O");
                        carType = true;
                        break;
                  default:
                        // do something...
                        System.out.print("Use Capital letters; S L O: ");
                        break;
                  }
        }while(!carType);
        
        // do vehicle selection              
        Vehicles aVehicle = findCar();
        rreg = aVehicle.getReg();
        
        System.out.println("Enter Start Date for Rental: ");            
        rstart = in.readLine();
        
        System.out.println("Enter Duration for Rental in Days: ");            
        rdur = in.readLine();
        int irdur = 0;
        if(!(rdur.equals(""))){
            Integer intob1 = new Integer(rdur);
            //get the int value of the Integer object    
            irdur = intob1.intValue();
        }
        
        // confirm rental details 
        
        //do rental constructor
        Rentals rentdoc1 = new Rentals(this, rcust, rreg, rstart, irdur);
        theRentals.add(rentdoc1);
    }
    
}