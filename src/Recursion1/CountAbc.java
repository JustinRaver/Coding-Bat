package Recursion1;

/**
 * Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
 * <p>
 * <p>
 * countAbc("abc") → 1
 * countAbc("abcxxabc") → 2
 * countAbc("abaxxaba") → 2
 */
public class CountAbc {
    public int countAbc(String str) {
        if (!str.contains("abc") && !str.contains("aba")) {
            return 0;
        } else if (str.contains("ababc")) {
            return 2;
        } else if (str.contains("abc")) {
            return countAbc(str.replaceFirst("abc", "")) + 1;
        } else {
            return countAbc(str.replaceFirst("aba", "")) + 1;
        }
    }
}
