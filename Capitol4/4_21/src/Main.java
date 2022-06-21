import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print the 10 numbers");
        int large = 0;
        int counter = 1;
        while (counter != 11) {
            System.out.printf("%d) ", counter);
            int number = input.nextInt();
            if( number>large) large = number;
            counter ++;
        }
        System.out.printf("The largest number is %d ", large);
        }

    }