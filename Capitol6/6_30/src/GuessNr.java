import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNr {
    public static SecureRandom randomNr = new SecureRandom();
    private static int numberGuess;
    public enum Status {TRY_AGAIN, FINISH}

    public static void main(String[] args) {

        while(true) {
            numberGuess = randomNr.nextInt(1000);
            System.out.println("Enter a number to guess");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();
            Status status = verifyNumber(guess);

            while (status == Status.TRY_AGAIN) {
                System.out.println("Enter a number to guess");
                guess = input.nextInt();
                status = verifyNumber(guess);
            }
            System.out.println("Type 1 if you want to play again and -1 if you want to stop");
            int choice = input.nextInt();
            if(choice == 1) continue;
            else if(choice == -1) break;
        }
    }

    public static Status verifyNumber(int nr)
    {
        if(nr == numberGuess) {
                System.out.println("Congratulations!");
                return Status.FINISH;
        }
            else if(nr<numberGuess) {
                System.out.println("Too low. Try again!");
                return Status.TRY_AGAIN;
        }
            else {
                System.out.println("Too high. Try Again!");
                return Status.TRY_AGAIN;
        }
    }
}
