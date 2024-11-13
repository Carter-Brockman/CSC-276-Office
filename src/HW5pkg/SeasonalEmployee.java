package HW5pkg;

public class SeasonalEmployee extends PartTimeEmployee{

    private String season;
    private double seasonalBonus;
    private double weeklyPaycheck;

    public SeasonalEmployee(String name, String SSN, double hourlyWage, int hoursWorked, String season, double seasonalBonus)
    {
        super(name, SSN, hourlyWage, hoursWorked);
        this.employeeCategory = "Seasonal Employee- " + this.season;
        this.season = season;
        this.seasonalBonus = seasonalBonus;
        this.weeklyPaycheck = (hourlyWage * hoursWorked) + seasonalBonus; //seasonalBonus only applies to seasonal (part-time) workers
    }

    @Override
    protected double calculatePay()
    {
        return (weeklyPaycheck);
    }

    @Override
    protected void displayInfo()
    {
        System.out.printf("%s (%s)\n\tHourly Wage: $%.2f\n\tHours Worked: %d\n\tWeekly Paycheck: %.2f\n", name, employeeCategory, hourlyWage, hoursWorked, weeklyPaycheck);
    }

}//End of SeasonalEmployee
