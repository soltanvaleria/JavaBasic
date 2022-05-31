import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your first name");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        System.out.println("Enter your second name");
        String lastName = input.nextLine();
        Date date = new Date();
        System.out.println("Enter your birth day");
        date.date = input.nextInt();
        System.out.println("Enter your birth month");
        date.month = input.nextInt();
        System.out.println("Enter your birth year");
        date.year = input.nextInt();
        HeartRates heartRates = new HeartRates(firstName, lastName, date);
        System.out.println("%nUser information:");
        System.out.printf("%s %s%nDate of birth: %s%nAge:%d years,%nMaximum Heart Rate: %d,%n" +
                        "Target Heart Range: %s",
                heartRates.getFirstName(), heartRates.getLastName(),
                heartRates.getBirth(), heartRates.calculateAge(), heartRates.calculateMaxHeartRate(),
                heartRates.calculateTargetHeartRate());
    }
}