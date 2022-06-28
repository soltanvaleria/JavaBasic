import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] nr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers between 1 and 30");
        for (int i=0; i<5; i++)
        {
            nr[i] = input.nextInt();
        }
        for( int i=0; i<5; i++)
        {
            for(int j = 0; j< nr[i]; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}