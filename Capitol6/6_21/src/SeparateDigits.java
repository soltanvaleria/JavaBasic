import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        displayDigits(number);
    }
    public static int quotient(int a, int b)
    {
        int number;
        number = a/b;
        return number;
    }
    public static int reminder (int a, int b)
    {
        int number;
        number = a%b;
        return number;
    }
    public static void displayDigits(int a)
    {
        System.out.println("The separating digits are:");
        int b = 10000;

        while (a !=0)
        {
            if(quotient(a,b)!=0)
            {
                System.out.printf("%d  ", quotient(a,b));
                a = reminder(a,b);
            }
            b/=10;

        }
    }
}
