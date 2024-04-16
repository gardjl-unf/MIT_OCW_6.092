/* MIT OpenCourseware Java I - Assignment 1
 * Author: Jason Gardner
 * Filename: Marathon.java
 * Date: January 24, 2020
 */


class GravityCalculator {
    public static void main(String[] arguments){
        final double GRAVITY =-9.81; // Earth's gravity in m/s^2
        final double CALCULATION_CONSTANT = 0.5;
        final double INITIAL_VELOCITY = 0.0;
        final double FALLING_TIME = 10.0;
        final double INITIAL_POSITION = 0.0;
        double finalPosition = 0.0;
        
        finalPosition = CALCULATION_CONSTANT * GRAVITY * Math.pow(FALLING_TIME,2) + INITIAL_VELOCITY * FALLING_TIME + INITIAL_POSITION;
        
        System.out.println("The object's position after " + FALLING_TIME +
                " seconds is " + finalPosition + " m.");
    }
}

/* What is the output of the unmodified program? 
 * Include this as a comment in the source code of your submission.
 * 
 * The object's position after 10.0 seconds is 0.0 m.
 */