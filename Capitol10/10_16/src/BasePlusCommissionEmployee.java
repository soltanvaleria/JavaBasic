public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String securitySocialNumber,
                                      double grossSales, double commissionRate, double baseSalary)
    {
        super(firstName, lastName, securitySocialNumber, grossSales, commissionRate);
        if(baseSalary < 0.0)
            throw new IllegalArgumentException(" Base salary must be > = 0.0");
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0)
            throw new IllegalArgumentException(" Base salary must be > = 0.0");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings()+ getBaseSalary();
    }

    @Override
    public String toString() {
        return String.format("Base plus %s%n%s: %.2f;", super.toString(), "Base salary", getBaseSalary());
    }
}