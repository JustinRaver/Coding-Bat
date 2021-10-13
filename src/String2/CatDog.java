package String2;

/**
 * Return true if the string "cat" and "dog" appear the same number of times in the given string.
 * <p>
 * <p>
 * catDog("catdog") → true
 * catDog("catcat") → false
 * catDog("1cat1cadodog") → true
 */
public class CatDog {
    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        String s = str;

        while (s.indexOf("dog") != -1) {
            s = s.substring(s.indexOf("dog") + 2);
            dogCount++;
        }

        while (str.indexOf("cat") != -1) {
            str = str.substring(str.indexOf("cat") + 2);
            catCount++;
        }
        return dogCount == catCount;
    }
}
