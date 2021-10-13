package Warmup2;

/**
 * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
 * <p>
 * <p>
 * stringX("xxHxix") → "xHix"
 * stringX("abxxxcd") → "abcd"
 * stringX("xabxxxcdx") → "xabcdx"
 */
public class StringX {
    public String stringX(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                temp += str.substring(i, i + 1);
            } else {
                if (str.charAt(i) != 'x') {
                    temp += str.substring(i, i + 1);
                }
            }
        }
        return temp;
    }
}
