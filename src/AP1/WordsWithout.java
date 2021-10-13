package AP1;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.
 * <p>
 * <p>
 * wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
 * wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
 * wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
 */
public class WordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        List<String> list = new ArrayList<>();

        for (String word : words) {
            if (!word.equals(target)) {
                list.add(word);
            }
        }
        String[] ret = list.toArray(new String[0]);
        return ret;
    }
}
