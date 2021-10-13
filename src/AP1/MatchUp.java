package AP1;

/**
 * Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and start with the same char. The strings may be any length, including 0.
 * <p>
 * <p>
 * matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
 * matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
 * matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1
 */
public class MatchUp {
    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            String strA = a[i];
            String strB = b[i];

            if (!strA.isEmpty() && !strB.isEmpty()) {
                if (strA.charAt(0) == strB.charAt(0)) {
                    count++;
                }
            }
        }
        return count;
    }
}
