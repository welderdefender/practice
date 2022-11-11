package beginner;

import java.util.Arrays;

/**
 * Ссылка на задачу: <a href="https://www.codewars.com/kata/576b93db1129fcf2200001e6/train/java">...</a>а
 */

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 2) return 0;
        Arrays.sort(numbers);
        return Arrays.stream(numbers).skip(1).limit(numbers.length - 2).sum();
    }
}