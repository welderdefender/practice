package beginner;

import java.util.Arrays;

/**
 * Ссылка на задачу: https://www.codewars.com/kata/55f9b48403f6b87a7c0000bd/train/java
 */

public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return ((Arrays.stream(classPoints)).average().getAsDouble() < yourPoints);
    }
}