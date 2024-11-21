package HW5pkg;

public abstract class Employee {

    protected String name;
    protected String SSN;
    protected String employeeCategory;

    //Super-constructor for use in subclasses
    public Employee(String name, String SSN, String employeeCategory)
    {
        this.name = name;
        this.SSN = SSN;
        this.employeeCategory = employeeCategory;
    }

    protected abstract double calculatePay(); //Each subclass has pay, but differing calculations

    //Simple displayInfo, shouldn't ever *only* return name unless error occurs with initialization
    protected void displayInfo()
    {
        System.out.printf(name);
    }

}//End of Employee
