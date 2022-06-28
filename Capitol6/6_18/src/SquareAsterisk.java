import java.util.Scanner;

public class SquareAsterisk {
    public static void main(String[] args) {

        System.out.println("Enter the side");
        int side;
        Scanner input = new Scanner(System.in);
        side = input.nextInt();
        squareOfAsterisk(side);
    }
    public static void squareOfAsterisk(int side)
    {
        for ( int i = 0; i< side; i++){
            for (int j = 0; j< side; j++) {
               System.out.print("*");
         }
        System.out.println();
        }
    }
}
