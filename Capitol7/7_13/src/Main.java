public class Main {
    public static void main(String[] args) {
        int [][] sales = new int[3][5];

        for (int row = 0; row < sales.length; row++)
        {
            for (int col = 0; col < sales[row].length; col++)
            {
                sales[row][col] = 0;
            }
        }
    }
}
