import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int nr;
        Scanner input = new Scanner(System.in);
        System.out.println("Give a 5 digit number");
        nr = input.nextInt();
        int nr1, nr2, nr3, nr4, nr5;
        nr1 = nr/10000;
        nr2 = (nr-nr1*10000)/1000;
        nr3 = (nr-nr1*10000 - nr2*1000)/100;
        nr4 = (nr-nr1*10000 - nr2*1000-nr3*100)/10;
        nr5 = nr%10;
        System.out.printf("%d   %d   %d   %d   %d",
                nr1, nr2, nr3, nr4, nr5 );
    }
}