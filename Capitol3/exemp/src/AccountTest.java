import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AccountCons myAccount = new AccountCons("Jane", 4);
        System.out.printf("Initial name is %s%n%n", myAccount.getName());

        System.out.println("Enter the name:");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.printf("%nName in object myAccount is:%n%s%n", myAccount.getName());
    }
}