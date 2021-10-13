package Functional2;

import java.util.List;

/**
 * Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
 * <p>
 * <p>
 * noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
 * noZ(["hziz", "hzello", "hi"]) → ["hi"]
 * noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
 */
public class NoZ {
    public List<String> noZ(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));
        return strings;
    }
}
