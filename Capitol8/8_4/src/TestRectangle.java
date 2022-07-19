import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Set the length and width");
        Scanner input = new Scanner(System.in);
        float length = input.nextFloat();
        float width = input.nextFloat();
        rectangle.setLength(length);
        rectangle.setWidth(width);
        System.out.printf("The length is %.2f%n" +
                "The width is %.2f%n", rectangle.getLength(), rectangle.getWidth());
        System.out.printf("The perimeter is %.2f%n" +
                "The are is %.2f ", rectangle.calculatePerimeter(), rectangle.calculateArea());

    }
}
