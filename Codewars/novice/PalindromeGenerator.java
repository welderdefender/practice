package novice;

/*
Task: Check if the given word is a palindrome. If it's not, generate a palindrome from the given word by adding its
reverse as a suffix.
When checking if a word is a palindrome, ignore case, but when generating a palindrome, them preserver case.

Don't worry about the inputs, they will always be valid.

Example 1: "otto":

  PalindromeGenerator.isPalindrome("otto") -> true
  PalindromeGenerator.generateString("otto") -> "otto"
Example 2: "Otto":

  PalindromeGenerator.isPalindrome("Otto") -> true
  PalindromeGenerator.generateString("Otto") -> "Otto"
Example 3: "noob"

  PalindromeGenerator.isPalindrome("noob") -> false
  PalindromeGenerator.generateString("noob") -> "noobboon"
Example 4: "Bump"

  PalindromeGenerator.isPalindrome("Bump") -> false
  PalindromeGenerator.generateString("Bump") -> "BumppmuB"

Ссылка на задачу: https://www.codewars.com/kata/561cee035bf6ca9560000020/train/java
 */

public class PalindromeGenerator {
    public boolean isPalindrome(String word) {
        return word.toLowerCase().equals(new StringBuilder(word.toLowerCase()).reverse().toString());
    }

    public String generateString(String word) {
        if (isPalindrome(word)) {
            return word;
        }
        return word + new StringBuilder(word).reverse();
    }
}