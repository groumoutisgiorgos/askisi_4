import javax.print.attribute.standard.OutputDeviceAssigned;
import java.awt.*;
import java.awt.print.Printable;
import java.util.Scanner;
public class HomeAppliancesStore {
    static String company_name="University of Peloponnise";
    static String adress="Sparti";
    static int workers=10;
    protected static int Counter=0;

    /** Getters and Setters*/

    public String getCompany_name() {
        return this.company_name;
    }

    public void setCompany_name(String newcompany_name) {
        this.company_name = newcompany_name;
    }

    public String getAddress() {
        return this.adress;
    }

    public void setAddress(String newaddress) {
        this.adress = newaddress;
    }

    public int getWorkers() {
        return this.getWorkers();
    }

    public void setWorkers(int newworkers) {
        this.workers = newworkers;
    }
    public static void main(String[] args) {

        /**user add's company,adress,employees information*/

        Scanner myObj = new Scanner(System.in);
        System.out.println("give the company's name: ");
        String company_name = myObj.nextLine();
        if (company_name == null) {
            System.out.println("error no company name found");
        } else {
            System.out.println("The company's name is: " + company_name);
        }

        {
            Scanner myObj2 = new Scanner(System.in);
            System.out.println("give the company address: ");
            String adress = myObj2.nextLine();
            if (adress == null) {
                System.out.println("error no address found");
            } else {
                System.out.println("the company adress is : " + adress);
            }
        }

        {
            Scanner myObj3 = new Scanner(System.in);
            System.out.println("How many workers are in the company: ");
            int workers = myObj3.nextInt();
            if (workers == 0) {
                System.out.println("there are no workers in the company");
            } else {
                System.out.println("There are: " + workers + "workers");
            }
        }
        /** here we give info for the device Fridge and call its function to print the info*/
        Fridge fridge = new Fridge(70, 190, 70, "Bosch", "KB90 AA","Fridge",120,"A++","inox",148,false,302);
        fridge.PrintFridge();
        /** here we give info for the device Air Condition and call its function to print the info*/
        AirCondition AC= new AirCondition(768, 243, 400, "Mitsubishi", "MSZ/MUZ-HR25VF","Air Condition",265,11942,12010,"A++",true,true);
        AC.PrintAirCondition();
        /** here we give info for the device Washing Machine and call its function to print the info*/
        Washing_Machine WM= new Washing_Machine(85,60,60,"Bosch","WNP1200D8","Washing Machine",175,8,55,false,14,1200);
        WM.PrintWashing_Machine();
        /** here we give info for the device Oven and call its function to print the info*/
        Oven O=new Oven(81,60,60,"Pitsos","PA10CF00","Oven",140,"A++","inox",true,155,"keramiki");
        O.PrintOven();
        /** Here is the counter for every device connected*/
        Counter = fridge.getCounterFridge() +WM.getCounterWashing_Machine() + O.getCounterOven() + AC.getCounterAirCondition();
        System.out.println("Exoun sundethei: " + Counter  +" Suskebes");

    }


}
