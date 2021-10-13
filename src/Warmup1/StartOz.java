package Warmup1;

/**
 * Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
 * <p>
 * <p>
 * startOz("ozymandias") → "oz"
 * startOz("bzoo") → "z"
 * startOz("oxx") → "o"
 */
public class StartOz {
    public String startOz(String str) {
        String temp = "";
        if (str.length() > 0) {
            if (str.charAt(0) == 'o') {
                temp += "o";
            }
        }
        if (str.length() > 1) {
            if (str.charAt(1) == 'z') {
                temp += "z";
            }
        }
        return temp;
    }
}
