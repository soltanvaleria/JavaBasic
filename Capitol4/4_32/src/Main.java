public class Main {
    public static void main(String[] args) {

        int count = 8;
        while ( count != 0)
        {
            if(count%2 == 0 )
            {
                int count2 = 0;
                while (count2 < 8) {
                    System.out.print("* ");
                    count2++;
                }
            }
            else {
                System.out.print(" ");
                int count2 = 0;
                while (count2 < 8) {
                    System.out.print("* ");
                    count2++;
                }
            }
            count--;
            System.out.println();
        }
    }
}