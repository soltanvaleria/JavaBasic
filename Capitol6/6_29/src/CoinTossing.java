import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    public enum Coin {HEADS, TAILS};
    private static  final SecureRandom randomNr = new SecureRandom();

    public static void main(String[] args) {
        System.out.println("Enter:" +
                " 1 - Toss Coin" +
                " 2 - Exit");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        int tails = 0, heads = 0;
        Coin status;

        while (choice == 1)
        {
            status = flip();
            if (status == Coin.TAILS) {
                System.out.println("Tails");
                tails++;
            }
            else if(status == Coin.HEADS){
                System.out.println("Heads");
                heads++;
            }
            System.out.println("Enter:" +
                    " 1 - Toss Coin" +
                    " 2 - Exit");
            choice = input.nextInt();
        }

        System.out.printf("The number of heads is %d%n" +
                "The number of tails is %d", heads, tails);
    }
    public static Coin flip ()
    {
        int side = randomNr.nextInt(2);
        if( side == 0) return Coin.HEADS;
        else return  Coin.TAILS;
    }
}
