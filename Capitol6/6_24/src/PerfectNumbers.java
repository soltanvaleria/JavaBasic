public class PerfectNumbers {
    public static void main(String[] args)
    {
        for(int i = 1; i<1000; i++)
        {
            if(isPerfect(i)==true) {
                System.out.printf("%d = ", i);
                divisor(i);
                System.out.println();
            }
        }

    }
    public static boolean isPerfect ( int number)
    {
        int sum = 0;
        for(int i = number; i > 1; i--)
        {
            if(number % i == 0)
            {
                sum += number / i;
            }
        }
        if(sum == number) return true;
        else return false;
    }
    public static void divisor(int number)
    {
        for(int i = number; i > 1; i--)
        {
            if(number % i == 0)
            {
                System.out.printf("%d  ", number/i);
            }
        }
    }
}
