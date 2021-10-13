package Warmup2;

/**
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 * <p>
 * <p>
 * stringSplosion("Code") → "CCoCodCode"
 * stringSplosion("abc") → "aababc"
 * stringSplosion("ab") → "aab"
 */
public class StringSplosion {
    public String stringSplosion(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            temp += str.substring(0, i + 1);
        }
        return temp;
    }
}
