package String2;

/**
 * A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
 * <p>
 * <p>
 * getSandwich("breadjambread") → "jam"
 * getSandwich("xxbreadjambreadyy") → "jam"
 * getSandwich("xxbreadyy") → ""
 */
public class GetSandwich {
    public String getSandwich(String str) {
        int firstIndex = str.indexOf("bread");
        int lastIndex = Integer.MIN_VALUE;
        int index = firstIndex;
        while ((index = str.indexOf("bread", index + 1)) != -1) {
            lastIndex = index;
        }
        if (lastIndex == Integer.MIN_VALUE) {
            return "";
        }
        return str.substring(firstIndex + 5, lastIndex);
    }
}
