package beginner;

/**
 * Ссылка на задачу: https://www.codewars.com/kata/53af2b8861023f1d88000832/train/java
 */

public class AreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
        if (name.startsWith("R") || name.startsWith("r")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}