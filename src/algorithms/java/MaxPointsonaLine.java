package algorithms.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: respass
 * @Date: 2019
 */
public class MaxPointsonaLine {

     class Point {
         int x;
         int y;
         Point() { x = 0; y = 0; }
         Point(int a, int b) { x = a; y = b; }
      }

    public int maxPoints(Point[] points) {
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Long, Integer> count = new HashMap<>();
            int same_points = 1;
            int max_points = 0;
            Point p1 = points[i];
            for (int j = i+1; j < points.length ; j++) {
                Point p2 = points[j];
                if (p1.x == p2.x && p1.y == p2.y)
                    same_points++;
                else {
                    long slope = getSlope(p1, p2);
                    int old = count.getOrDefault(slope, 0);
                    count.put(slope, old+1);
                    max_points = Math.max(max_points, old + 1);
                }
            }
            res = Math.max(res, max_points + same_points);
        }
        return res;
    }


    long getSlope(Point p1, Point p2) {
         int dx = p2.x - p1.x;
         int dy = p2.y - p1.y;
         if (dy == 0)
             return (long) p1.y << 32 | 0;
         if (dx == 0)
             return (long) 0 << 32 | p1.x;

         int d = gcd(dx, dy);
         return (long) (dy / d) << 32 |  (dx / d);
    }

    int gcd(int m, int n) {
         return n == 0 ? m : gcd(n, m % n);
    }




}
