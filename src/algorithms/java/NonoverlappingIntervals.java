package algorithms.java;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: respass
 * @Date: 2018
 */
public class NonoverlappingIntervals {

    //dp
    public int eraseOverlapIntervals(Interval[] intervals) {

        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start) {
                    return o1.start - o2.start;
                }
                return o1.end - o2.end;
            }
        });

        int[] mem = new int[intervals.length];
        Arrays.fill(mem, 1);
        for (int i = 1; i < intervals.length; i++) {
            for (int j = 0; j < i; j++) {
                if (intervals[i].start >= intervals[j].end) {
                    mem[i] = Math.max(mem[i], 1 + mem[j]);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < mem.length; i++) {
            res = Math.max(res, mem[i]);
        }
        return intervals.length - res;

    }

    //greedy
    public int eraseOverlapIntervals2(Interval[] intervals) {


        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.end != o2.end) {
                    return o1.end - o2.end;
                }
                return o1.start - o2.start;
            }
        });

        int res = 1;
        int pre = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start >= intervals[pre].end) {
                res++;
                pre = i;
            }
        }
        return intervals.length - res;



    }

    class Interval{
        int start;
        int end;
        Interval() {
            start = 0;
            end = 0;
        }
        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}
