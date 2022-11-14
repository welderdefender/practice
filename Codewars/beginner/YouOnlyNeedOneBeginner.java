package beginner;

import java.util.Arrays;

/**
 * Ссылка на задачу: https://www.codewars.com/kata/56676e8fabd2d1ff3000000c/train/java
 */

public class YouOnlyNeedOneBeginner {
    public static boolean check(Object[] a, Object x) {
        return Arrays.stream(a).anyMatch(x :: equals);
    }
}