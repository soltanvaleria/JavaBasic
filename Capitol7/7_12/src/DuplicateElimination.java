import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {

        int [] numbers = new int[5];
        int number;
        int countNr = 0;
        int i = 0;
        Scanner input = new Scanner(System.in);

        for (int count = 0 ; count < numbers.length; count++) {
            System.out.println("Enter a number between 10 and 100, inclusive");
            number = input.nextInt();
            if(count == 0) {
                numbers[i] = number;
                i++;
            }
            else {
                if(isUnique(numbers, number) == true) {
                    numbers[i] = number;
                    i++;
                }
            }
            printArray(numbers, i);
        }

        }

        private static  boolean isUnique( int [] numbers, int number)
        {
            for(int i = 0; i < numbers.length; i++)
            {
                if(number == numbers[i])
                {
                    return false;
                }
            }
            return true;
        }
        private static void printArray(int[] numbers, int i)
        {
            System.out.println("Unique numbers:");
            for(int j = 0; j < i; j++)
            {
                System.out.printf("%d ", numbers[j]);
            }
            System.out.println();
        }
    }

