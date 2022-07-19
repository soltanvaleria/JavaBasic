
import java.text.NumberFormat;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        SavingsAccount.setAnnualInterestRate(0.04);
        saver1.setSavingsBalance(2000.0);
        saver2.setSavingsBalance(3000.0);
        System.out.printf("%14s     %35s%n", "Saver1", "Saver2");
        System.out.printf("%s %17s  %17s    %17s %17s%n", "Month", "Savings Balance", "Monthly Interest"
        , "Savings Balance", "Monthly Interest");
        for( int i =1; i<=12; i++)
        {
                System.out.printf("%5d %17s %17s    %17s %17s%n",i,
                    NumberFormat.getCurrencyInstance().format(saver1.getSavingsBalance()),
                    NumberFormat.getCurrencyInstance().format(saver1.calculateMonthlyInterest()),
                        NumberFormat.getCurrencyInstance().format(saver2.getSavingsBalance()),
                        NumberFormat.getCurrencyInstance().format(saver2.calculateMonthlyInterest()));
        }

        SavingsAccount.modifyInterestRate(0.05);
        System.out.printf("%n%14s     %35s%n", "Saver1", "Saver2");
        System.out.printf("%s %17s  %17s    %17s %17s%n", "Month", "Savings Balance", "Monthly Interest"
                , "Savings Balance", "Monthly Interest");
        System.out.printf("%5s %17s %17s    %17s %17s%n","Next",
                    NumberFormat.getCurrencyInstance().format(saver1.getSavingsBalance()),
                    NumberFormat.getCurrencyInstance().format(saver1.calculateMonthlyInterest()),
                    NumberFormat.getCurrencyInstance().format(saver2.getSavingsBalance()),
                    NumberFormat.getCurrencyInstance().format(saver2.calculateMonthlyInterest()));

    }
}
