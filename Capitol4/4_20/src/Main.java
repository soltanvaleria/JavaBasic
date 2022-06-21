import java. util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 1;
        while (count != 4)
        {
            System.out.println("Enter worked hours :");
            int hours = input.nextInt();
            System.out.println("Enter the rate of salary");
            int rate = input.nextInt();
            double salary;
            if(hours>40)
            {
                salary = (double) 40* rate+ (hours - 40) * rate * 1.5;
            }
            else salary = (double)hours*rate;

            System.out.printf("%d) Employee’s gross pay is %.2f%n", count, salary);
            count++;
        }
    }
}