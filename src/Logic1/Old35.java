package Logic1;

/**
 * Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod
 * <p>
 * <p>
 * old35(3) → true
 * old35(10) → true
 * old35(15) → false
 */
public class Old35 {
    public boolean old35(int n) {
        boolean mod3 = false;
        boolean mod5 = false;
        if (n % 3 == 0) {
            mod3 = true;
        }
        if (n % 5 == 0) {
            mod5 = true;
        }
        return mod3 ^ mod5;
    }
}
