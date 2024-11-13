package HW5pkg;

public class FullTimeEmployee extends Employee{

    private double monthlySalary;
    private int hoursWorked;

    public FullTimeEmployee(String name, String SSN, double monthlySalary, int hoursWorked)
    {
        super(name, SSN, "Full-Time Employee");
        this.monthlySalary = monthlySalary;
        this.hoursWorked = hoursWorked;
    }

    @Override
    protected double calculatePay()
    {
        return (monthlySalary);
    }

    @Override
    protected void displayInfo()
    {
        System.out.printf("%s (%s)\n\tMonthly Salary: $%.2f\n\tHours Worked: %d\n", name, employeeCategory, monthlySalary, hoursWorked);
    }

} //End of FullTimeEmployee
