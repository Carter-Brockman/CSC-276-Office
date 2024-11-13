package HW5pkg;

public abstract class Employee {

    protected String name;
    protected String SSN;
    protected String employeeCategory;

    public Employee(String name, String SSN, String employeeCategory)
    {
        this.name = name;
        this.SSN = SSN;
        this.employeeCategory = employeeCategory;
    }

    protected abstract double calculatePay();

    protected void displayInfo()
    {
        System.out.printf(name);
    }

}//End of Employee
