public class Main {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("N\t\t10*N\t\t100*N\t\t1000*N");
        while ( count < 6)
        {
            System.out.printf("%d\t\t%d\t\t\t%d\t\t\t%d%n", count, count*10, count*100, count *1000);
            count++;
        }
    }
}