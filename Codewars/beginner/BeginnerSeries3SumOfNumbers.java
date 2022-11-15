package beginner;

/*
Given two integers a and b, which can be positive or negative, find the sum of all the integers between and
including them and return it. If the two numbers are equal return a or b.

Note: a and b are not ordered!

Examples (a, b) --> output (explanation)
(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)

Ссылка на задачу: https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java
*/

public class BeginnerSeries3SumOfNumbers {
    public int GetSum(int a, int b) {
        int highest = a;
        int lowest = b;

        if (a == b)
            return a;
        else if (b > a) {
            highest = b;
            lowest = a;
        }

        return (highest - lowest + 1) * (lowest + highest) / 2;
    }
}