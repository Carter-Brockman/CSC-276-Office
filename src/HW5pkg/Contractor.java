package HW5pkg;

public class Contractor extends Employee{

    private double weeklyRate;
    private String project; //What job are they being paid to do?

    public Contractor(String name, String SSN, String project, double weeklyRate)
    {
        super(name, SSN, "Contractor");
        this.project = project;
        this.weeklyRate = weeklyRate;
    }

    @Override
    protected double calculatePay()
    {
        return (weeklyRate);
    }

    @Override
    protected void displayInfo()
    {
        System.out.printf("%s (%s)\n\tWeekly Rate: $%.2f\n\tProject: %s\n", name, employeeCategory, weeklyRate, project);
    }

}//End of Contractor
