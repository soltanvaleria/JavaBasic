import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = input.nextInt();
        System.out.printf("Diameter = %d%nCircumference = %f%nArea = %f%n",
                2*radius, 2*radius*Math.PI, Math.PI*radius*radius);
    }
}