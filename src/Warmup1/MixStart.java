package Warmup1;

/**
 * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
 * <p>
 * <p>
 * mixStart("mix snacks") → true
 * mixStart("pix snacks") → true
 * mixStart("piz snacks") → false
 */
public class MixStart {
    public boolean mixStart(String str) {
        if (str.length() > 2) {
            return str.startsWith("ix", 1);
        }
        return false;
    }
}
