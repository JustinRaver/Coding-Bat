package Functional1;

import java.util.List;

/**
 * Given a list of strings, return a list where each string has "y" added at its start and end.
 * <p>
 * <p>
 * moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
 * moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
 * moreY(["yay"]) → ["yyayy"]
 */
public class MoreY {
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }
}
