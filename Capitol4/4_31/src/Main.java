import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the binary number!");
        Scanner input = new Scanner(System.in);
        int binary_number = input.nextInt();
        int temp;
        int decimal_number = 0;
        int count = 1;
        while (binary_number!=0)
        {
            temp = binary_number%10;
            binary_number /= 10;
            decimal_number += temp * count;
            count *=2;
        }
        System.out.printf("%d", decimal_number);
    }
}