import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int product_nr, quantity ;
        double value1 =0, value2=0, value3=0, value4=0, value5=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the product number or -1 if you want to exit: ");
        product_nr = input.nextInt();

        while(product_nr!=-1)
        {
            System.out.println("Enter the quantity: ");
            quantity = input.nextInt();
            switch (product_nr) {
                case 1:
                    value1+=quantity*2.98;
                    break;
                case 2:
                    value2+= quantity*4.50;
                    break;
                case 3:
                    value3+= quantity*9.98;
                    break;
                case 4:
                    value4 += quantity*4.49;
                    break;
                case 5:
                    value5 += quantity*6.87;
                    break;

            }
            System.out.print("Enter the product number or -1 if you want to exit: ");
            product_nr = input.nextInt();
        }

        System.out.printf("Product 1 = %.2f%n", value1);
        System.out.printf("Product 2 = %.2f%n", value2);
        System.out.printf("Product 3 = %.2f%n", value3);
        System.out.printf("Product 4 = %.2f%n", value4);
        System.out.printf("Product 5 = %.2f%n", value5);
    }
}