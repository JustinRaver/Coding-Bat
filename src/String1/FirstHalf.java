package String1;

/**
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 * <p>
 * <p>
 * firstHalf("WooHoo") → "Woo"
 * firstHalf("HelloThere") → "Hello"
 * firstHalf("abcdef") → "abc"
 */
public class FirstHalf {
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }
}
