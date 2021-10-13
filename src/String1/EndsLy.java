package String1;

/**
 * Given a string, return true if it ends in "ly".
 * <p>
 * <p>
 * endsLy("oddly") → true
 * endsLy("y") → false
 * endsLy("oddy") → false
 */
public class EndsLy {
    public boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.startsWith("ly", str.length() - 2);
    }
}
