import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int sum;

        System.out.println("Introdu primul numar");
        num1 = input.nextInt();

        System.out.println("Introdu al 2 nr");
        num2 = input.nextInt();

        sum = num1+num2;
        System.out.printf("Suma este %d", sum);

    }
}





