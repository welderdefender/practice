package beginner;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ссылка на задачу: https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java
 */

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(Integer.class::isInstance).collect(Collectors.toList());
    }
}