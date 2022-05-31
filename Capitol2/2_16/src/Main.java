import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int nr1;
        int nr2;
        Scanner input = new Scanner(System.in);
        System.out.println("Nr 1  = ");
        nr1 = input.nextInt();
        System.out.println("Nr 2 =");
        nr2 = input.nextInt();

        if(nr1>nr2) System.out.printf("Nr 1 = %d is larger", nr1);
        else if(nr1<nr2) System.out.printf("Nr2 = %d is larger %n", nr2);
        else System.out. printf("This nr are equal");
    }
}