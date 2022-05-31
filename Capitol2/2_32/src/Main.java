import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int nr1, nr2, nr3, nr4, nr5;
        int poz = 0, neg = 0, zero = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        nr1 = input.nextInt();
        nr2 = input.nextInt();
        nr3 = input.nextInt();
        nr4 = input.nextInt();
        nr5 = input.nextInt();

        if(nr1<0) neg++;
        if(nr2<0) neg++;
        if(nr3<0) neg++;
        if(nr4<0) neg++;
        if(nr5<0) neg++;

        if(nr1>0) poz++;
        if(nr2>0) poz++;
        if(nr3>0) poz++;
        if(nr4>0) poz++;
        if(nr5>0) poz++;

        if(nr1==0) zero++;
        if(nr2==0) zero++;
        if(nr3==0) zero++;
        if(nr4==0) zero++;
        if(nr5==0) zero++;

        System.out.printf("Positive nr = %d%nNegative nr = %d%nZero nr = %d%n", poz, neg, zero);
    }


}