package beginner;

/**
 * Ссылка на задачу: https://www.codewars.com/kata/53af2b8861023f1d88000832/train/java
 */

public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        return ((flower1 % 2 > 0) && (flower2 % 2 == 0)) || ((flower2 % 2 > 0) && (flower1 % 2 == 0));
    }
}