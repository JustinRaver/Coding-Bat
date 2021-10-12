package Map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    /**
     * Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.
     * <p>
     * <p>
     * firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
     * firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
     * firstChar([]) → {}
     *
     * @param strings
     * @return
     */
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (String s : strings) {
            String str = s.substring(0, 1);

            if (map.containsKey(str)) {
                map.put(str, map.get(str) + s);
            } else {
                map.put(str, s);
            }
        }
        return map;
    }
}
