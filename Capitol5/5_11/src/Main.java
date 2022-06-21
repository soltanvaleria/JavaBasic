import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the number of integers");
        Scanner input = new Scanner(System.in);
        int nr = input.nextInt();
        System.out.printf("Enter %d numbers%n", nr);
        int number, smallest;
        number = input.nextInt();
        smallest = number;
        for (int i = 1; i<nr; i++)
        {
            number = input.nextInt();
            if (number < smallest)
                smallest = number;
        }
        System.out.printf("The smallest nr is %d ", smallest);
    }
}