import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        System.out.println("Enter the number of integer you want to verify");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int nr;
        for(int i = 0 ; i<number; i++)
        {
            System.out.println("Enter the number:");
            nr = input.nextInt();
            if(isEven(nr) == true) System.out.println("The nr is even");
            else System.out.println("The nr is odd");
        }
    }
    public static boolean isEven(int number)
    {
        if(number%2 == 0) return true;
        else return false;

    }
}
