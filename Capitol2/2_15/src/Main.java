import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nr1, nr2;
        int sum, prod, diff, div;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number!");
        nr1= input.nextInt();
        System.out.println("Enter the second nr");
        nr2=input.nextInt();

        System.out.printf("Sum = %d%n", nr1+nr2);
        System.out.printf("Product= %d%n", nr1*nr2);
        System.out.printf("Difference= %d%n", nr1-nr2);
        System.out.printf("Quotient= %d%n", nr1/nr2);

    }
}