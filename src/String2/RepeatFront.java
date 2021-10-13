package String2;

/**
 * Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
 * <p>
 * <p>
 * repeatFront("Chocolate", 4) → "ChocChoChC"
 * repeatFront("Chocolate", 3) → "ChoChC"
 * repeatFront("Ice Cream", 2) → "IcI"
 */
public class RepeatFront {
    public String repeatFront(String str, int n) {
        str = str.substring(0, n);
        String retVal = "";
        n = 0;
        while (str.length() > 0) {
            retVal += str;
            n++;
            str = str.substring(0, str.length() - 1);
        }
        return retVal;
    }
}
