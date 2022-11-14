package beginner;

import java.util.Arrays;

/**
 * Ссылка на задачу: https://www.codewars.com/kata/57a2013acf1fa5bfc4000921/java
 */

public class CalculateAverage {
    public static double find_average(int[] array) {
        return Arrays.stream(array).mapToDouble(val -> val).average().orElse(0);
    }
}