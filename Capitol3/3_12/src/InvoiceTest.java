import java.util.Scanner;
public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoice = new Invoice("1","Pen", 300, 5 );
        System.out.printf("| Nr   | Des.  | Quantity | Price  |%n" +
                          "| %s   | %s    | %d       | %f     |%n",
                invoice.getNumber(), invoice.getDescription(), invoice.getQuantity(), invoice.getPrice() );
        System.out.println("Enter the new price");
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        invoice.setPrice(price);
        System.out.printf("The new price for the item is %f%n", invoice.getPrice());
        System.out.printf("The invoice amount is %f%n", invoice.getInvoiceAmount());
    }
}