package interview.other;

/**
 * @Author: respass
 * @Date: 2018
 * There are ‘p’ balls of type P, ‘q’ balls of type Q and ‘r’ balls of type R. Using the balls we want to create a straight line such that no two balls of same type are adjacent.
 *
 * Examples :
 *
 * Input  : p = 1, q = 1, r = 0
 * Output : 2
 * There are only two arrangements PQ and QP
 *
 * Input  : p = 1, q = 1, r = 1
 * Output : 6
 * There are only six arrangements PQR, QPR,
 * QRP, RQP, PRQ and RPQ
 *
 * Input  : p = 2, q = 1, r = 1
 * Output : 6
 * There are only six arrangements PQRP, QPRP,
 * PRQP, RPQP, PRPQ and PQPR
 *
 * We strongly recommend that you click here and practice it, before moving on to the solution.
 *
 * Naive Solution:
 * The naive solution to this problem is a recursive solution. We recursively call for three cases
 * 1) Last ball to be placed is of type P
 * 2) Last ball to be placed is of type Q
 * 3) Last ball to be placed is of type R
 */


public class Ways_to_arrange_Balls_such_that_adjacent_balls_are_of_different_types {

    int countWays(int p, int q, int r, int last) {
        if (p < 0 || q < 0 || r < 0)
            return 0;

        if (p == 1 && q == 0 && r == 0 && last == 0)
            return 1;


        if (p == 0 && q == 1 && r == 0 && last == 1)
            return 1;

        if (p == 1 && q == 0 && r == 1 && last == 2)
            return 1;

        if (last == 0) {
            return countWays(p-1, q, r, 1) + countWays(p-1, q, r, 2);
        }

        if (last == 1) {
            return countWays(p, q-1, r, 0) + countWays(p, q-1, r, 2);
        }

        if (last == 2) {
            return countWays(p, q, r-1, 0) + countWays(p, q, r-1, 1);
        }
        return 0;
    }

    int countUtil(int p, int q, int r) {
        return countWays(p, q, r, 0) + countWays(p, q, r, 1) + countWays(p, q, r, 2);
    }


}
