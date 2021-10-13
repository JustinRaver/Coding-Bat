package String2;

/**
 * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
 * <p>
 * <p>
 * xyzThere("abcxyz") → true
 * xyzThere("abc.xyz") → false
 * xyzThere("xyz.abc") → true
 */
public class XyzThere {
    public boolean xyzThere(String str) {
        while (str.indexOf(".xyz") > -1) {
            str = str.substring(0, str.indexOf(".xyz")) + str.substring(str.indexOf(".xyz") + 3);
        }

        return str.indexOf("xyz") > -1;
    }
}
