package Logic2;

/**
 * We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
 * <p>
 * <p>
 * makeChocolate(4, 1, 9) → 4
 * makeChocolate(4, 1, 10) → -1
 * makeChocolate(4, 1, 7) → 2
 */
public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int bigSize = 5;
        int smallSize = 1;

        while (goal >= bigSize && big > 0) {
            goal -= bigSize;
            big--;
        }
        int smallCount = 0;
        while (goal >= smallSize && small > 0) {
            goal -= smallSize;
            small--;
            smallCount++;
        }

        if (goal == 0) {
            return smallCount;
        }
        return -1;
    }
}
