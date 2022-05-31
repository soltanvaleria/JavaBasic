import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("Enter your first name: ");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        System.out.print("Enter your second name: ");
        String lastName = input.nextLine();
        Date date = new Date();
        System.out.print("Enter your gender: 1 - male, 2 - female: ");
        String gender;
        if(input.nextInt() == 1) gender = "male";
        else gender = "female";
        System.out.print("Enter your birth date: ");
        date.date = input.nextInt();
        System.out.print("Enter your birth month: ");
        date.month = input.nextInt();
        System.out.print("Enter your birth year: ");
        date.year = input.nextInt();
        System.out.print("Enter your height in m: ");
        double height = input.nextDouble();
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();

        HealthProfile profile = new HealthProfile(firstName, lastName, gender, date, height, weight);
        System.out.println("\nUser information:");
        System.out.printf("%s %s%nDate of birth: %s%nAge:%d years,%nGender: %s,%nMaximum Heart Rate: %d,%n" +
                        "Target Heart Range: %s%n",
                profile.getFirstName(), profile.getLastName(),
                profile.getBirthDate(), profile.calculateAge(), profile.getGender(),
                profile.calculateMaxHeartRate(),
                profile.calculateTargetHeartRate());
        profile.displayBMI();
    }
}