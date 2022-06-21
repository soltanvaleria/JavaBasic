import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the size of the square");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int count = 1;
        while (count != size+1)
        {
            if( count == 1 || count == size )
            {
                int count1 = 1;
                while (count1 != size+1) {
                    System.out.print("* ");
                    count1++;
                }
            }
            else
            {
                int count1 = 1;
                while(count1 != size+1)
                {
                    if(count1 == 1 || count1 == size)
                        System.out.print("* ");
                    else System.out.print("  ");
                    count1++;
                }
            }
            count++;
            System.out.print("\n");
        }
    }
}