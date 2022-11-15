package beginner;

import java.util.Arrays;

/*
Write a function which calculates the average of the numbers in a given list.
Note: Empty arrays should return 0.

Ссылка на задачу: https://www.codewars.com/kata/57a2013acf1fa5bfc4000921/java
 */

public class CalculateAverage {
    public static double find_average(int[] array) {
        return Arrays.stream(array).mapToDouble(val -> val).average().orElse(0);
    }
}