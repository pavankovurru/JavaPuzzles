package Puzzles;

public class ClockAngleProblem {

//    A method to solve such problems is to consider the rate of change of the angle in degrees per minute.
//    The hour hand of a normal 12-hour analogue clock turns 360° in 12 hours (720 minutes) or 0.5° per minute. The minute hand rotates through 360° in 60 minutes or 6° per minute


        //hour = 0.5 * ((60*H)+ M)
        //min = 6 * M
    public static int findAngle(int hour, int min)
    {
        // find position of hour's hand
        int h = (int) (0.5 * ((60*hour)+min));
        System.out.println("Hour angle - "+h);

        // find position of minute's hand
        int m = (int) 6 * min ;
        System.out.println("Minute angle - "+m);

        // calculate the angle difference
        int angle = Math.abs(h - m);

        // consider shorter angle and return it
        if (angle > 180) {
            angle = 360 - angle;
        }

        return angle;
    }

    public static void main(String[] args)
    {
        int hour = 5;
        int min = 24;

        System.out.print(findAngle(hour, min));
    }

}
