import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Lera S", 1000);
        System.out.printf("%s balance is %f%n",
                acc1.getName(), acc1.getBalance() );
        Scanner input = new Scanner(System.in);
        System.out.println("Enter deposit amount");
        double depositAmount = input.nextDouble();
        acc1.deposit(depositAmount);
        System.out.println("Enter withdraw amount");
        double withdrawAmount = input.nextDouble();
        acc1.withdraw(withdrawAmount);
        System.out.printf("%s balance is %f%n",
                acc1.getName(), acc1.getBalance() );
    }
}