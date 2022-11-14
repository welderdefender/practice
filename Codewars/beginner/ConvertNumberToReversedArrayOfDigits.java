package beginner;

/**
 * Ссылка на задачу: https://www.codewars.com/kata/5513795bd3fafb56c200049e/train/java
 */

public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}