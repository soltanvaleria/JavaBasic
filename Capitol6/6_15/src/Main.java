import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the sides");
        Scanner input = new Scanner(System.in);
        double side1, side2;
        side1 = input.nextDouble();
        side2 = input.nextDouble();
        double hypo = hypotenuse(side1, side2);
        System.out.printf("The hypotenuse is %.2f", hypo);

    }
    public static double hypotenuse (double side1, double side2)
    {
        double hypo;
        hypo = Math.sqrt(Math.pow(side1,2)+Math.pow(side2, 2));
        return hypo;
    }
}
