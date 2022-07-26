public class HourlyEmployee extends Employee {

    private double hour;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hour, double wage)
    {
        super(firstName, lastName, socialSecurityNumber);
        if(hour < 0.0 || hour > 168.0)
            throw new IllegalArgumentException("the hour must be >0 and <168");
        if(wage< 0.0)
            throw new IllegalArgumentException("the wage must pe > 0.0");
        this.hour = hour;
        this.wage = wage;
    }

    public void setHour(double hour) {
        if(hour < 0.0 || hour > 168.0)
            throw new IllegalArgumentException("the hour must be >0 and <168");
        this.hour = hour;
    }

    public void setWage(double wage) {
        if(wage < 0.0)
            throw new IllegalArgumentException("the wage must pe > 0.0");
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public double getWage() {
        return wage;
    }

    public double earnings()
    {
        return getHour()*getWage();
    }
    @Override
    public String toString()
    {
        return String.format("%s %s%s: %.2f%n%s: %.2f%n",
                "Hourly", super.toString(),
                "Hours", getHour(),
                "Wage", getWage());
    }
}
