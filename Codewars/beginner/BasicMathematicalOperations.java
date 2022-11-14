package beginner;

/**
 * Ссылка на задачу: https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java
 */

public class BasicMathematicalOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
            default:
                System.out.println("Unsupported operation");
                break;
        }
        return 0;
    }
}