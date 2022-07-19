public class InitArray {
    public static void main(String[] args) {
        int size;
        if(args.length != 1)
            size = 10;
        else size =  Integer.parseInt(args[0]);
        int[] array = new int[size];
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}
