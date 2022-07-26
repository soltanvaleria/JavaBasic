public class EmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Pam", "Anderson", "222-22-2222", 6000, 0.05);

        System.out.printf("%n%s:%n%n%s%s: %.2f%n",
                "Commission employee info:",
                commissionEmployee.toString(),"Earnings", commissionEmployee.earnings());

        BasePlusCommissionEmployee baseEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        System.out.printf("%n%s:%n%n%s%s: %.2f",
                "Base plus commission employee info:",
                baseEmployee.toString(),"Earnings", baseEmployee.earnings());

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Ion", "Andrei", "222-233-333", 40.0, 20.0);
        System.out.printf("%n%s:%n%n%s%s: %.2f",
                "Hourly employee info:",
                hourlyEmployee.toString(),"Earnings", hourlyEmployee.earnings());
    }
}
