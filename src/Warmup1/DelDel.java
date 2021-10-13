package Warmup1;

/**
 * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
 * <p>
 * <p>
 * delDel("adelbc") → "abc"
 * delDel("adelHello") → "aHello"
 * delDel("adedbc") → "adedbc"
 */
public class DelDel {
    public String delDel(String str) {
        if (str.length() > 3) {
            if (str.length() == 4) {
                return str.substring(0, 1);
            } else {

                if (str.startsWith("del", 1)) {
                    String newStr = str.substring(0, 1);
                    for (int i = 4; i < str.length(); i++) {
                        newStr += str.charAt(i);
                    }
                    return newStr;
                }
            }
        }
        return str;
    }
}
