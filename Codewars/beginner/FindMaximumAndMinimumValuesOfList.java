package beginner;

import java.util.Arrays;

/**
 * Ссылка на задачу: https://www.codewars.com/kata/577a98a6ae28071780000989/train/java
 */

public class FindMaximumAndMinimumValuesOfList {
    public int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}