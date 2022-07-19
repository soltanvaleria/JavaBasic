public class SavingsAccount {

    private static double annualInterestRate;
    private double  savingsBalance;
    public double calculateMonthlyInterest()
    {
        double monthlyInterest = savingsBalance*annualInterestRate/12;
        savingsBalance +=monthlyInterest;
        return monthlyInterest;
    }

    public static void modifyInterestRate(double newRate)
    {
        SavingsAccount.annualInterestRate = newRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}
