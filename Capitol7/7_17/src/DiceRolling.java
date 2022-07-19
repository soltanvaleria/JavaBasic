
import java.util.Random;

public class DiceRolling {
    public static final Random randomNr = new Random();
    public static void main(String[] args) {
        int [] count = new int [13];
        for(int i = 0; i<36000000; i++)
        {
            int b = rollingDice();
            for(int j = 2; j<count.length; j++)
            {
                if (b == j) count[j]++;
            }
        }
        System.out.printf("%8s%14s%n", "Sum", "Frequency");
        for( int i = 2; i < count.length; i++)
        {
            System.out.printf("%8d%14d%n", i , count[i]);
        }


    }
    public static int rollingDice ()
    {
        int dice1, dice2;
        dice1 = 1 + randomNr.nextInt(6);
        dice2 = 1 + randomNr.nextInt(6);
        return dice1+dice2;
    }


}
