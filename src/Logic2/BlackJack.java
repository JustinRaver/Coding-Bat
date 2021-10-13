package Logic2;

/**
 * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
 * <p>
 * <p>
 * blackjack(19, 21) → 21
 * blackjack(21, 19) → 21
 * blackjack(19, 22) → 19
 */
public class BlackJack {
    public int blackjack(int a, int b) {
        int goal = 21;
        int diffA = goal - a;
        int diffB = goal - b;

        if (diffA < 0 && diffB < 0) {
            return 0;
        } else if (diffA < 0) {
            return b;
        } else if (diffB < 0) {
            return a;
        }


        if (diffA > diffB) {
            return b;
        }
        return a;
    }
}
