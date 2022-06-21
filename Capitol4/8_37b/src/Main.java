import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the number of terms ");
        Scanner input = new Scanner(System.in);
        int terms = input.nextInt();
        double e = 1;
        while (terms>0)
        {
            e+= (double) 1/factorial(terms);
            terms --;
        }
        System.out.printf("e = %f", e);
    }

    static int factorial(int n) {
        int fact = 1;
            while (n > 0)
            {
                fact *= n;
                n--;
            }
        return fact;
    }
}