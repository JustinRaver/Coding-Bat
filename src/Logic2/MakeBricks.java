package Logic2;

/**
 * We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
 * <p>
 * <p>
 * makeBricks(3, 1, 8) → true
 * makeBricks(3, 1, 9) → false
 * makeBricks(3, 2, 10) → true
 */
public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        //big == 5 inches
        //small == 1 inch
        //goal is total
        int total = small + 5 * big;

        if (total < goal) {
            return false;
        }
        if (small < goal % 5) {
            return false;
        }

        goal = goal - goal % 5;

        if (goal > big * 5) {
            goal = goal - big * 5;
            return small >= goal;
        }
        return true;
    }
}
