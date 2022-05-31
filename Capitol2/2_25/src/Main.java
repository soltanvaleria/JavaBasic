import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int nr;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        nr = input.nextInt();
        if(nr%2 == 0) System.out.printf("Nr %d is odd", nr);
        else System.out.printf("Nr %d is even", nr);
    }
}