import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int nr1, nr2, nr3;
        int sum, ave, prod;
        Scanner input = new Scanner(System.in);

        System.out.println("Dati numerele!");
        nr1= input.nextInt();
        nr2= input.nextInt();
        nr3= input.nextInt();
        sum= nr1+nr2+nr3;
        ave = sum/3;
        prod = nr1*nr2*nr3;
        System.out.printf("Sum = %d%nAverage = %d%nProduct = %d%n", sum, ave, prod);
        if( nr1>nr2 & nr1>nr3) System.out.printf("Nr1 = %d este cel mai mare %n", nr1);
        else if (nr2>nr1 & nr2>nr3) System.out.printf("Nr2 = %d este cel mai mare %n", nr2);
        else if (nr3>nr1 & nr3>nr2) System.out.printf("Nr3 = %d este cel mai mare %n", nr3);

        if (nr1<nr2 & nr1<nr3) System.out.printf("Nr1 = %d este cel mai mic %n", nr1);
        else if (nr2<nr1 & nr2<nr3) System.out.printf("Nr2 = %d este cel mai mic %n", nr2);
        else if (nr3<nr2 & nr3<nr1) System.out.printf("Nr3 = %d este cel mai mic %n", nr3);
    }
}