package easy;

/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

Constraints:

1 <= n <= 45

Ссылка на задачу: https://leetcode.com/problems/climbing-stairs/
*/

import java.util.HashMap;

public class ClimbingStairs {
    HashMap<Integer, Integer> count = new HashMap<>();

    public int climbStairs(int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (count.get(n - 1) == null)
            count.put(n - 1, climbStairs(n - 1));
        if (count.get(n - 2) == null)
            count.put(n - 2, climbStairs(n - 2));
        return count.get(n - 1) + count.get(n - 2);
    }
}
