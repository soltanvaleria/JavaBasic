import java.security.SecureRandom;
public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status {CONTINUE, WON, LOST};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN =7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {

        int [] countLost = new int [50];
        int [] countWin = new int [50];
       for( int i = 0; i<1000000; i++)
       {
           try{

        int myPoint = 0;
        int count = 1;
        Status gameStatus;
        int sumOfDice = rollDice();
        switch (sumOfDice)
        {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                //System.out.printf("Point is %d%n", myPoint);
                break;
        }
        if(gameStatus==Status.LOST)
            countLost[1]++;
        else if(gameStatus == Status.WON)
            countWin[1]++;

        while (gameStatus == Status.CONTINUE)
        {
            count++;
            sumOfDice = rollDice();
            if(sumOfDice == myPoint) {
                gameStatus = Status.WON;
                countWin[count]++;
            }
            else
            if (sumOfDice == SEVEN) {
                gameStatus = Status.LOST;
                countLost[count]++;
            }
        }}
           catch (ArrayIndexOutOfBoundsException e){
               continue;
           }
       }
       printResult(countLost, countWin);

    }

    public static int rollDice()
    {
        int die1 = 1+randomNumbers.nextInt(6);
        int die2 = 1+randomNumbers.nextInt(6);

        int sum  = die1+die2;
       // System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    public static void printResult(int[] countLost, int[] countWin)
    {
        System.out.printf("%4s%10s %10s%n", "Roll","Loss", "Wins");
       int sumWin = 0;
       int sumLoss = 0;
       int averageLength = 0 ;
        for( int i = 1; i< countLost.length; i++)
        {
            System.out.printf("%4d%10d %10d%n",i, countLost[i],countWin[i]);
            sumWin+= countWin[i];
            sumLoss+= countLost[i];
            averageLength+=(i*(countLost[i]+countWin[i]));
        }
        System.out.printf("The chance of winning is %.2f%%%n", (double)sumWin/10000);
        System.out.printf("The average length is %.2f rolls", (double)averageLength/(sumLoss+sumWin));
    }
}