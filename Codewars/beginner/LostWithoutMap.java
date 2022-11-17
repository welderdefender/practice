package beginner;

/*
Given an array of integers, return a new array with each value doubled.

For example:
[1, 2, 3] --> [2, 4, 6]

Ссылка на задачу: https://www.codewars.com/kata/57f781872e3d8ca2a000007e/train/java
 */

public class LostWithoutMap {
    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
}