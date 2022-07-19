public class Time2Test {
    public static void main(String[] args) {
        try {
            Time2 t1= new Time2(23, 59, 30);
            for(int i = 0; i<40; i++)
            {
             t1.tick();
             displayTime(t1);
            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%nException while initializing t1: %s%n", e.getMessage());
        }

    }
    private static void displayTime(Time2 t)
    {
        System.out.printf("%s     %s%n",  t.toUniversalString(), t.toString());
    }
}
