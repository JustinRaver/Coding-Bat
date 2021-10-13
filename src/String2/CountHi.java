package String2;

/**
 * Return the number of times that the string "hi" appears anywhere in the given string.
 * <p>
 * <p>
 * countHi("abc hi ho") → 1
 * countHi("ABChi hi") → 2
 * countHi("hihi") → 2
 */
public class CountHi {
    public int countHi(String str) {
        int count = 0;
        while (str.indexOf("hi") != -1) {
            count++;
            str = str.substring(str.indexOf("hi") + 1);
        }
        return count;
    }
}
