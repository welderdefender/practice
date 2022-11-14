package beginner;

import java.util.Arrays;

/**
 * Ссылка на задачу: https://www.codewars.com/kata/53dc54212259ed3d4f00071c/train/java
 */

public class SumArrays {
    public static double sum(double[] numbers) {
        if (numbers.length == 0) return 0.0;
        return Arrays.stream(numbers).sum();
    }
}