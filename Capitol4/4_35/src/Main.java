import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the numbers != 0");
        int a, b, c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if(a==0 || b==0 || c==0)
        {
            System.out.println("One of your number is zero ");
        }
        else
        {
            if((a+b)>c)
            {
                if((b+c)>a)
                {
                    if((a+c)>b)
                    {
                        System.out.println("Could Represent the sides of triangle");
                    }
                    else
                    {
                        System.out.println("Could Not Represent the Sides of Triangle");
                    }
                }
                else
                {
                    System.out.println("Could Not Represent the Sides of Triangle");
                }
            }
            else
            {
                System.out.println("Could Not Represent the Sides of Triangle");
            }

        }
    }
}
