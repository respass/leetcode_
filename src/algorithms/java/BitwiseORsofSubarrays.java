package algorithms.java;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: respass
 * @Date: 2018
 */
public class BitwiseORsofSubarrays {

    //dp[i] 以A[i]结尾的set
    public int subarrayBitwiseORs(int[] A) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> cur = new HashSet<>();
        Set<Integer> next = new HashSet<>();
        for (int a : A) {
            next = new HashSet<>();
            next.add(a);
            for(int b : cur) {
                next.add(a | b);
            }
            ans.addAll(next);
            cur = next;
        }
        return ans.size();
    }
}
