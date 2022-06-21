import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the number of customers");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int customer =1;

        while (count>0)
        {
            System.out.printf("Enter the data for the %d customer%n", customer);
            System.out.println("Account number: ");
            String acc_nr = input.nextLine();
            System.out.println("Beginning Balance: ");
            double beginning_balance = input.nextDouble();
            System.out.println("Charges: ");
            double charges = input.nextDouble();
            System.out.println("Credits: ");
            double credits = input.nextDouble();
            System.out.println("Credit Limit: ");
            double credit_limit = input.nextDouble();
            double balance = beginning_balance + charges - credits;
            System.out.printf("The new balance is %.2f%n", balance);
            if(balance<credit_limit) System.out.println("Credit limit exceeded!");
            count --;
            customer++;
        }
    }
}