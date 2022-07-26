public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String lastName,String firstName, String securitySocialNumber,
                              double grossSales, double commissionRate)
    {
        super(firstName, lastName, securitySocialNumber);
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        if(commissionRate < 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionSale) {
        if(commissionSale < 0.0 || commissionSale >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionSale;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate()*getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("Commission %s%s: %.2f;%n%s: %.2f;", super.toString(),
                "Gross sales", getGrossSales(), "Commission Rate", getCommissionRate());
    }
}
