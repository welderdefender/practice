package novice;

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word
within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also
often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

Ссылка на задачу: https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java
 */

public class ConvertStringToCamelCase {
    static String toCamelCase(String s) {
        final String[] separator = s.split("([^a-zA-Z']+)'*\\1*");
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < separator.length; i++) {
            if (i == 0) {
                sb.append(separator[i]);
            } else if (separator[i].length() > 0) {
                sb.append(separator[i].replaceFirst(separator[i].substring(0, 1),
                        separator[i].substring(0, 1).toUpperCase()));
            }
        }
        return new String(sb);
    }
}