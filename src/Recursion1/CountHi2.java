package Recursion1;

/**
 * Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.
 * <p>
 * <p>
 * countHi2("ahixhi") → 1
 * countHi2("ahibhi") → 2
 * countHi2("xhixhi") → 0
 */
public class CountHi2 {
    public int countHi2(String str) {
        if (str.indexOf("hi") == -1) {
            return 0;
        }
        if (str.contains("xhi")) {
            return countHi2(str.replaceAll("xhi", ""));
        }
        return countHi2(str.replaceFirst("hi", "")) + 1;

    }
}
