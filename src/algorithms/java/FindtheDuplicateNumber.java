package algorithms.java;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: respass
 * @Date: 2018
 */
public class FindtheDuplicateNumber {

    //Find the smallest m such that len(nums <= m) > m, which means m is the duplicate number.
    //O(nlogn)
    public int findDuplicate(int[] nums) {

        int l = 1;
        int r = nums.length - 1;
        while (l < r) {
            int m = l + (r -l) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= m)
                    count++;
            }
            if (count > m) {
                r = m;
            }else {
                l = m + 1;
            }
        }
        return l;
    }


//    Convert the problem to find the entry point of the cycle in a linked list.
//
//    Take the number in the array as the index of next node.
//
//            [1,3,4,2,2]
//
//            0->1->3->2->4->2 cycle: 2->4->2
//
//            [3,1,3,4,2]
//
//            0->3->4->2->3->4->2 cycle 3->4->2->3
//
//    Time complexity: O(n)

    public int findDuplicate2(int[] nums) {
        int slow = 0;
        int fast = 0;
        while(true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast) {
                break;
            }
        }

        slow = 0;
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

}
