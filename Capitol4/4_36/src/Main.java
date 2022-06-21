import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("One of your numbers is zero");
        }
        else
        {
            if(a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
                System.out.println("The numbers could represent the sides of a right triangle");
            else System.out.println("The numbers could not represent the sides of a right triangle");
        }

    }
}