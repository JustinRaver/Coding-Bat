package String2;

/**
 * Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
 * <p>
 * <p>
 * repeatEnd("Hello", 3) → "llollollo"
 * repeatEnd("Hello", 2) → "lolo"
 * repeatEnd("Hello", 1) → "o"
 */
public class RepeatEnd {
    public String repeatEnd(String str, int n) {

        StringBuilder stringbuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            stringbuilder.append(str.substring(str.length() - n));
        }
        return stringbuilder.toString();
    }
}
