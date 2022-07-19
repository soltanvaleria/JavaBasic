import java.util.Scanner;

public class TurtleGraphics {
    public enum Position {TOP, RIGHT, BOTTOM, LEFT}
    public static int [][] floor = new int [20][20];
    public static boolean penDown = false;
    public static int positionX = 0;
    public static int positionY = 0;

    public static void main(String[] args) {
        System.out.println("Command\n" +
                "1 Pen up\n" +
                "2 Pen down\n" +
                "3 Turn right\n" +
                "4 Turn left\n" +
                "5,10 Move forward 10 spaces (replace 10 for a different number of spaces)\n" +
                "6 Display the 20-by-20 array\n" +
                "9 End of data (sentinel)");
        System.out.println("Enter your commands");
        Scanner input = new Scanner(System.in);
        Position currentPosition = Position.RIGHT;
        int continueLoop = 1;


        while(continueLoop !=9)
        {
            String command = input.next();
            switch (command)
            {
                case "1":
                    penDown = false;
                    break;
                case "2":
                    penDown = true;
                    break;
                case "3":
                    switch (currentPosition)
                    {
                        case TOP:
                            currentPosition = Position.RIGHT;
                            break;
                        case LEFT:
                            currentPosition = Position.TOP;
                            break;
                        case RIGHT:
                            currentPosition = Position.BOTTOM;
                            break;
                        case BOTTOM:
                            currentPosition = Position.LEFT;
                            break;
                    }
                    break;
                case "4":
                    switch (currentPosition){
                        case BOTTOM:
                            currentPosition = Position.RIGHT;
                            break;
                        case RIGHT:
                            currentPosition = Position.TOP;
                            break;
                        case LEFT:
                            currentPosition = Position.BOTTOM;
                            break;
                        case TOP:
                            currentPosition = Position.LEFT;
                            break;
                    }
                    break;
                case "6":
                    displayFloor();
                    break;
                case "9":
                    continueLoop = 9;
                    break;
                default:
                    if(command.startsWith("5"))
                    {
                        int steps = Integer.parseInt(command.replace("5,",""));
                        switch (currentPosition)
                        {
                            case LEFT:
                                moveLeft(steps);
                                break;
                            case TOP:
                                moveTop(steps);
                                break;
                            case RIGHT:
                                moveRight(steps);
                                break;
                            case BOTTOM:
                                moveBottom(steps);
                                break;
                        }

                    }
                    break;

            }

        }


    }

    public static void displayFloor()
    {
        for(int row = 0; row< floor.length; row++)
        {
            for( int column = 0; column< floor[row].length; column++)
            {
                if(floor[column][row]==1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void moveLeft(int steps)
    {
        while(steps>0)
        {
            if(penDown)
            {
                floor[positionX][positionY] = 1;
            }
            positionX--;
            steps--;
        }
    }
    public static void moveRight(int steps)
    {
        while(steps>0)
        {
            if(penDown)
            {
                floor[positionX][positionY] = 1;
            }
            positionX++;
            steps--;
        }
    }
    public static void moveTop(int steps)
    {
        while(steps>0)
        {
            if(penDown)
            {
                floor[positionX][positionY] = 1;
            }
            positionY--;
            steps--;
        }
    }
    public static void moveBottom(int steps)
    {
        while(steps>0)
        {
            if(penDown)
            {
                floor[positionX][positionY] = 1;
            }
            positionY++;
            steps--;
        }
    }

}
