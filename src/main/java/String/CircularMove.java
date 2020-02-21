package String;

class CircularMove
{

    // moves are circular if the starting and ending coordinates are the same

    // check if given set of moves is circular on not
    public static boolean checkCircularMove(String str)
    {
        // start from coordinates (0, 0)
        int x = 0, y = 0;

        // assume initial direction is North
        char dir = 'N';

        // read each instruction from input String
        for (int i = 0; i < str.length(); i++)
        {
            switch (str.charAt(i))
            {
                // move one unit in same direction
                case 'M':
                    if (dir == 'N') {
                        y++;
                    } else if (dir == 'S') {
                        y--;
                    } else if (dir == 'E') {
                        x++;
                    } else if (dir == 'W') {
                        x--;
                    } break;

                // change direction to left of current direction
                case 'L':
                    if (dir == 'N') {
                        dir = 'W';
                    } else if (dir == 'W') {
                        dir = 'S';
                    } else if (dir == 'S') {
                        dir = 'E';
                    } else if (dir == 'E') {
                        dir = 'N';
                    } break;

                // change direction to right of current direction
                case 'R':
                    if (dir == 'N') {
                        dir = 'E';
                    } else if (dir == 'E') {
                        dir = 'S';
                    } else if (dir == 'S') {
                        dir = 'W';
                    } else if (dir == 'W') {
                        dir = 'N';
                    }
            }
        }

        // if we're back to starting coordinates (0, 0),
        // the move is circular
        return (x == 0 && y == 0);
    }

    public static void main(String[] args)
    {
        String str = "MMRMMRMMRMM";

        if (checkCircularMove(str))
            System.out.println("Circular Move");
        else
            System.out.println("Non-Circular Move");

    }
}