/* MIT OpenCourseware Java I - Assignment 2
 * Author: Jason Gardner
 * Filename: Marathon.java
 * Date: January 24, 2020
 */


public class FooCorporation {
    public static void main (String[] args) {
        String[] employees = { "Employee 1", "Employee 2", "Employee 3" };
        double[] payRate = { 7.50, 8.20, 10.00 };
        int[] hoursWorked = { 35, 47, 73 };
        for (int i = 0; i <= 2; i++) {
            System.out.printf("%s", employees[i]);
            calculator(payRate[i], hoursWorked[i]);
        }
    }
    public static void calculator (double pay, int hours) {
        double totalPay = 0;
        if (60 < hours || pay < 8) {
            final String errorNotice =" has erroneous data.";
            final String errorPay = " Pay rate must be greater than $8.00/hr";
            final String errorHours = " Number of hours worked must be less than 60.";
            String errorMessage;
            if (hours > 60) {
                errorMessage = errorNotice + errorHours;
            } else {
                errorMessage = errorNotice + errorPay;
            }
            System.out.println(errorMessage);
            return;
        } else if (hours >40) {
            totalPay = (hours - 40) * (pay * 1.5) + (40 * pay);
        } else {
        totalPay = pay * hours;
        }
        System.out.printf(" made $%.2f.\n", totalPay);
    }
}