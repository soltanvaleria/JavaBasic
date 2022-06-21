import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Write the number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fact = 1;

        if(n<0) System.out.println("Your number is negative");
        else if(n==0) System.out.println("n! = 1");
        else {
            while(n>0)
            {
                fact *= n;
                n--;
            }
            System.out.printf("n! = %d", fact);
        }
    }
}