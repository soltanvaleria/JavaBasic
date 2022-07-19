public class Main {
    public static int product(int...number)
    {
        int product=1;
        for(int nr: number)
            product*=nr;
        return product;
    }
    public static void main(String[] args) {
        int [] nr = new int[4];
        for(int i = 0; i< nr.length; i++)
        {
            nr[i]=i+1;
        }
        System.out.printf("%d * %d = %d%n", nr[0], nr[1], product(nr[0], nr[1]));
        System.out.printf("%d * %d * %d = %d%n", nr[0], nr[1], nr[2], product(nr[0], nr[1], nr[2]));
        System.out.printf("%d * %d * %d * %d = %d%n", nr[0], nr[1], nr[2], nr[3], product(nr[0], nr[1], nr[2], nr[3]));

    }
}
