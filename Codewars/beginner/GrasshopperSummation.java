package beginner;

/**
 * Ссылка на задачу: https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/java
 */

public class GrasshopperSummation {
    public static int summation(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}