import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the value of the 1 item or -1 to quit: ");
        int value= input.nextInt();
        int total = 0;
        int count = 1;
        int count_calc= 0;
        while (value != -1)
        {
            total += value;
            count++;
            count_calc++;
            System.out.printf("Enter the value of the %d item or -1 to quit: ", count);
            value= input.nextInt();
        }
        if (count_calc > 0)
        {
            System.out.printf("Value of the items is: %d%n", total);
            double week_plus = (double) total*0.09;
            System.out.printf("Week plus is %.2f%n", week_plus);
            System.out.printf("Total earnings: %.2f%n" ,500+week_plus);
        }
    }
}