import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Write a five-digit integer");
        Scanner input = new Scanner(System.in);
        Palindromes number = new Palindromes();
        number.num = input.nextInt();

        while(true){
            if( number.verify_length() != 5 )
            {
                System.out.print("The number is not a five-digit integer. Enter another nr: ");
                number.num = input.nextInt();
            }
            else break;
        }
        number.verify_palindrome();
    }
}