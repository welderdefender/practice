package novice;

/*
Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in
the form of a phone number.

Example
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
The returned format must be correct in order to complete this challenge.

Don't forget the space after the closing parentheses!



Ссылка на задачу: https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
*/

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder s = new StringBuilder("(");
        for (int i = 0; i < numbers.length; i++) {
            s.append(numbers[i]);
            if (i == 2) {
                s.append(") ");
            }
            if (i == 5) {
                s.append("-");
            }
        }
        return s.toString();
    }
}