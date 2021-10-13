package String2;

/**
 * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
 * <p>
 * <p>
 * bobThere("abcbob") → true
 * bobThere("b9b") → true
 * bobThere("bac") → false
 */
public class BobThere {
    public boolean bobThere(String str) {
        for (int i = 2; i < str.length(); i++) {
            if (str.charAt(i - 2) == 'b' && str.charAt(i) == 'b') {
                return true;
            }
        }
        return false;
    }
}
