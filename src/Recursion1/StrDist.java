package Recursion1;

/**
 * Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.
 * <p>
 * <p>
 * strDist("catcowcat", "cat") → 9
 * strDist("catcowcat", "cow") → 3
 * strDist("cccatcowcatxx", "cat") → 9
 */
public class StrDist {
    public int strDist(String str, String sub) {
        //count the distance from the first occurrence to the next occurrence

        //remove anything at front that isnt occurrence
        int idx = str.indexOf(sub);
        if (idx == -1) {
            return 0;
        }

        int idx2 = str.indexOf(sub, idx + 1);

        if (idx2 == -1) {
            return sub.length();
        }
        //return distance + recursive call
        return (idx2 - idx) + strDist(str.substring(idx2), sub);

    }
}
