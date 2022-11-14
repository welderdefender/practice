package beginner;

import java.util.Arrays;

/**
 * Ссылка на задачу: https://www.codewars.com/kata/56676e8fabd2d1ff3000000c/train/java
 */

public class NeedleInHaystack {
    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}