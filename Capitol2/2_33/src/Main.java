import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double w, h, bmi;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Weight kg");
        w = input.nextDouble();
        System.out.println("Enter your Height meters");
        h = input.nextDouble();

        System.out.println("Your weight is:");
        bmi = w/(h*h);
        if(bmi<18.5) System.out.println("Underweight");
        if(bmi>=18.5 & bmi< 25) System.out.println("Normal");
        if(bmi>=25 & bmi <30) System.out.println("Overweight");
        if(bmi>=30) System.out.println("Underweight");

    }
}