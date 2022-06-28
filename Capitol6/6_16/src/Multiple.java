import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        System.out.println("Give the number of pairs you want to introduce");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int nr1, nr2;
        for(int i = 0 ; i< number; i++)
        {
            System.out.println("Enter the numbers:");
            nr1 = input.nextInt();
            nr2 = input.nextInt();
            System.out.printf("The second number is the multiple of the second: %b%n", isMultiple(nr1, nr2));
        }
    }
    public static boolean isMultiple(int nr1, int nr2)
    {
        if(nr1%nr2 == 0) return true;
        else
        return false;
    }
}
