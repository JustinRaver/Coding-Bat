package Warmup2;

/**
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 * <p>
 * <p>
 * stringBits("Hello") → "Hlo"
 * stringBits("Hi") → "H"
 * stringBits("Heeololeo") → "Hello"
 */
public class StringBits {
    public String stringBits(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.length() < 3) {
            return str.substring(0, 1);
        }
        String temp = "";
        for (int i = 0; i < str.length(); i += 2) {
            temp += str.substring(i, i + 1);
        }
        return temp;
    }
}
