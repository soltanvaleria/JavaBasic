public class Main {
    public static void main(String[] args) {

        System.out.println("Number                 Factorial");
        for (int i = 0 ; i<=20; i++)
        {
            System.out.printf("%6d  %20d%n", i, factorial(i));
        }

    }
    static long factorial(int n) {
        long fact = 1;
        while (n > 0)
        {
            fact *= n;
            n--;
        }
        return fact;
    }
}