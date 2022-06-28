public class Main {
    public static void main(String[] args) {


        double amount;
        double principal = 1000.0;

        System.out.printf("%s%20s%n", "Year", "Amount of deposit");
        for (double rate = 5; rate<=10 ; rate++)
        {
            System.out.printf("Rate = %.2f%n", rate);
            System.out.printf("%s%20s%n", "Year", "Amount of deposit");
            for (int year = 1; year<=10; ++year)
            {
                amount = principal*Math.pow(1.0+rate/100, year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
        }


            }
}