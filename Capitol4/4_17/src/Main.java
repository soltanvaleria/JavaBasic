import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total_miles = 0;
        int total_gallons = 0;
        int counter = 0, count = 1;
        while (counter != -1)
        {
            System.out.printf("Enter the data for the %d trip%n", count);
            System.out.print("Miles: ");
            int miles = input.nextInt();
            total_miles += miles;
            System.out.print("Gallons:" );
            int gallon = input.nextInt();
            total_gallons += gallon;
            double gallon_mile = (double)gallon/miles;
            System.out.printf("Gallons per mile for the %d trip: %.2f%n",count, gallon_mile);
            double total_gallon_mile =(double)total_gallons/ total_miles;
            System.out.printf("Gallons per mile total: %.2f%n", total_gallon_mile);
            System.out.println("If you want to finish type -1, else type 0");
            counter = input.nextInt();
            count ++;
        }
    }
}