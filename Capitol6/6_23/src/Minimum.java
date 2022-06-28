import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        System.out.println("Enter the 3 float numbers");
        Scanner input = new Scanner(System.in);
        float nr1 = input.nextFloat();
        float nr2 = input.nextFloat();
        float nr3 = input.nextFloat();
        System.out.printf("The smallest number is %.2f", minimum3(nr1, nr2, nr3));
    }
    public static float minimum3(float nr1, float nr2, float nr3)
    {
        float minim;
        minim = Math.min(nr1, Math.min(nr2, nr3));
        return minim;
    }
}
