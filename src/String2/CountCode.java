package String2;

/**
 * Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
 * <p>
 * <p>
 * countCode("aaacodebbb") → 1
 * countCode("codexxcode") → 2
 * countCode("cozexxcope") → 2
 */
public class CountCode {
    public int countCode(String str) {
        int count = 0;
        while (str.indexOf("co") != -1 && str.indexOf("co") < str.length() - 3) {
            if (str.charAt(str.indexOf("co") + 3) == 'e') {
                count++;
                str = str.substring(str.indexOf("co") + 4);
            } else {
                str = str.substring(str.indexOf("co") + 1);
            }
        }
        return count;
    }
}
