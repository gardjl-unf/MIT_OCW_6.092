/* MIT OpenCourseware Java I - Assignment 3
 * Author: Jason Gardner
 * Filename: Marathon.java
 * Date: January 24, 2020
 */

public class Marathon {
    public static void main (String[] args) {
            String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
            };

            int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
            };

            for (int i = 0; i < names.length; i++) {
                System.out.printf("%s: %d minutes%n", names[i], times[i]);
            }
            FirstPlace(names, times);
            SecondPlace(names, times);
    }
    public static void FirstPlace(String[] names, int[] times) {
        int bestTimeIndex = 0;
            for (int i = 1; i < names.length; i++) {
                bestTimeIndex = times[i] < times[bestTimeIndex] ? i : bestTimeIndex ;
            }
            System.out.printf("The best time is by runner %s at %d minutes.%n", names[bestTimeIndex],times[bestTimeIndex]);
    }
    public static void SecondPlace(String[] names, int[] times) {
        int bestTimeIndex = 0;
        int secondBestTimeIndex = 0;
            for (int i = 1; i < names.length; i++) {
                if (times[i] < times[bestTimeIndex] && times[i] < times[secondBestTimeIndex]) {
                    bestTimeIndex = i;
                }
                else if (times[i] < times[secondBestTimeIndex]) {
                    secondBestTimeIndex =i;
                }
            }
            System.out.printf("The second best time is by runner %s at %d minutes.%n", names[secondBestTimeIndex],times[secondBestTimeIndex]);
    }
}
