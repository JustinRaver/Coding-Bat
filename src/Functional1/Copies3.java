package Functional1;

import java.util.List;

/**
 * Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
 * <p>
 * <p>
 * copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
 * copies3(["24", "a", ""]) → ["242424", "aaa", ""]
 * copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
 */
public class Copies3 {
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;
    }
}
