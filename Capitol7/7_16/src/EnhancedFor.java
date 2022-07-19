public class EnhancedFor {
    public static void main(String[] args) {
        if(args.length == 0 ) System.out.printf("Please re-enter the entire command, including, the array numbers");
        double [] numbers = new double[args.length];
        double sum = 0;
        for (int i = 0; i< args.length; i++)
        {
            numbers[i] = Double.parseDouble(args[i]);
        }

        for(double number: numbers)
        {
            sum += number;
        }
        System.out.printf("The sum is %.2f", sum);

    }
}
