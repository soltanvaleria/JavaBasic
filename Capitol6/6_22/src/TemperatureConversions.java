import java.util.Scanner;

public class TemperatureConversions {
    public static void main(String[] args) {
        System.out.println("Enter:\n" +
                "1 to convert celsius to fahrenheit\n" +
                "2 to convert fahrenheit to celsius\n");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if(choice == 1)
        {
            System.out.println("Enter the temperature in celsius");
            double temp = input.nextDouble();
            System.out.printf("The equivalent in fahrenheit is %.2f",fahrenheit(temp));

        }
        else if(choice ==2)
        {
            System.out.println("Enter the temperature in fahrenheit");
            double temp = input.nextDouble();
            System.out.printf("The equivalent in celsius is %.2f",celsius(temp));
        }
        else System.out.println("You enter an invalid number");
    }

    public static double celsius(double fahrenheit)
    {
        double celsius = 5.0/9.0*(fahrenheit-32);
        return  celsius;

    }
    public static double fahrenheit(double celsius)
    {
        double fahrenheit = 9.0/5.0*celsius+32;
        return fahrenheit;
    }
}
