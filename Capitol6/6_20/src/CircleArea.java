import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        circleArea(radius);
    }
    public static void circleArea(double radius)
    {
        double area;
        area = Math.PI*Math.pow(radius, 2);
        System.out.printf("The area of the circle is %.3f", area);
    }
}
