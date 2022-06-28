import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("Enter the side");
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        System.out.println("Enter the fill character");
        char fill = input.next().charAt(0);
        square(side, fill);
    }
    public static void square(int side, char  fillCharacter)
    {
        for( int i = 0; i< side; i++)
        {
            for( int j = 0 ; j< side; j++)
            {
                System.out.printf("%c", fillCharacter);
            }
            System.out.println();
        }
    }
}
