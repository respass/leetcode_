package datastruct.brinarySearch;

/**
 * @Author: respass
 * @Date: 2018
 */
public class Brinary {



    //first index of A, A[i] > val
    public static int upper_bound(int[] A, int val, int l, int r) {
        while (l < r) {
            int m = l + (r - l) / 2;
            if (A[m] > val) {
                r = m;
            }else {
                l = m + 1;
            }
        }
        return l;
    }


    //first index of A, A[i] >= val
    public static int lower_bound(int[] A, int val, int l, int r) {
        while (l < r) {
            int m = l + (r - l) / 2;
            if (A[m] >= val) {
                r = m;
            }else {
                l = m + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] A = {1,2,2,2,4,4,6};
        System.out.println(lower_bound(A, 0, 0, A.length));
        System.out.println(lower_bound(A, 2, 0, A.length));
        System.out.println(lower_bound(A, 3, 0, A.length));


    }
}
