package HW5pkg;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        //Reference for how the data is structured without an ArrayList
        /*
        Employee FTE1 = new FullTimeEmployee("Bob Adams", "123-32-231", 3200.00, 150);
        Employee PTE1 = new PartTimeEmployee("Jon Arbuckle", "216-14-4897",19.35,32);
        Employee SE1 = new SeasonalEmployee("Sally Smith", "843-69-2360",17.85, 35, "Winter", 800);
        Employee Con1 = new Contractor("Bob Builder", "694-91-3761","Studio Apartment", 925.75);
         */

        //Adding Employees tp arraylist, could be done
        employees.add(new FullTimeEmployee("Bob Adams", "123-32-231", 3200.00, 150));
        employees.add(new PartTimeEmployee("Jon Arbuckle", "216-14-4897",19.35,32));
        employees.add(new SeasonalEmployee("Sally Smith", "843-69-2360",17.85, 35, "Winter", 800));
        employees.add(new Contractor("Bob Builder", "694-91-3761","Studio Apartment", 925.75));

        //Start of output
        System.out.println("=====================================");
        for(Employee employee: employees)
        {
            employee.displayInfo(); //can use calculatePay, but makes organizing code much more complicated
            System.out.println("=====================================");
        }


    } //End of main()

} //End of MainClass
