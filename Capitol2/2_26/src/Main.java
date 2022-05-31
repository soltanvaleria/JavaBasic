import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int nr1, nr2;
        System.out.println("Dati numerele");
        nr1 = input.nextInt();
        nr2= input.nextInt();
        if(nr2%nr1==0 ) System.out.printf("The nr1 %d is multiple of the nr2 %d", nr1, nr2);
        else System.out.printf("The nr1 %d is not the multiple of the nr2 %d", nr1, nr2);
    }
}