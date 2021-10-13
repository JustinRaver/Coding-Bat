package Warmup1;

/**
 * Given a string, return true if the string starts with "hi" and false otherwise.
 * <p>
 * <p>
 * startHi("hi there") → true
 * startHi("hi") → true
 * startHi("hello hi") → false
 */
public class StartHi {
    public boolean startHi(String str) {
        if (str.length() < 3) {
            return str.contains("hi");
        }
        return str.startsWith("hi");
    }
}
