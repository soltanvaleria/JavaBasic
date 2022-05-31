public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    Employee(String firstName, String lastName, double salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(double salary) {
        if(salary>=0.0) this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public double getYearlySalary()
    {
        return salary*12;
    }
    public void raise(double raiseAmount)
    {
        salary = salary+(raiseAmount*salary)/100;
    }
}
