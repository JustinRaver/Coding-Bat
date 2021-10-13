package Recursion1;

/**
 * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
 * <p>
 * <p>
 * changeXY("codex") → "codey"
 * changeXY("xxhixx") → "yyhiyy"
 * changeXY("xhixhix") → "yhiyhiy"
 */
public class ChangeXY {
    public String changeXY(String str) {
        if (str.contains("x")) {
            return str.replace("x", "y");
        }
        return str;
    }
}
