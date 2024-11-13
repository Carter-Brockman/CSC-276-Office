package HW5pkg;

public class PartTimeEmployee extends Employee{

    protected double hourlyWage;
    protected int hoursWorked;
    protected double weeklyPaycheck;

    public PartTimeEmployee(String name, String SSN, double hourlyWage, int hoursWorked)
    {
        super(name, SSN, "Part-Time Employee");
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
        this.weeklyPaycheck = (hourlyWage * hoursWorked);
    }

    @Override
    protected double calculatePay()
    {
        return (weeklyPaycheck); //Math is done in constructor for simplicity
    }

    @Override
    protected void displayInfo()
    {
        System.out.printf("%s (%s)\n\tHourly Wage: $%.2f\n\tHours Worked: %d\n\tWeekly Paycheck: %.2f\n", name, employeeCategory, hourlyWage, hoursWorked, weeklyPaycheck);
    }

}//End of PartTimeEmployee
