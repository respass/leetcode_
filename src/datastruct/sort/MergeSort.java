package datastruct.sort;

/**
 * @Author: respass
 * @Date: 2018
 */
public class MergeSort {

    public void sort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length-1, temp);
    }

    public void mergeSort(int[] arr, int l, int r, int[] temp) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid, temp);
            mergeSort(arr, mid+1, r, temp);
            merge(arr, l, mid, r, temp);
        }
    }

    void merge(int[] arr, int l, int mid, int r, int[] temp) {
        int i = l;
        int j = mid + 1;
        int cur = 0;
        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                temp[cur++] = arr[i++];
            }else {
                temp[cur++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[cur++] = arr[i++];
        }
        while (j <= r) {
            temp[cur++] = arr[j++];
        }
        cur = 0;
        while (l <= r) {
            arr[l++] = temp[cur++];
        }

    }

    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        int[] nums = {2, 4, 1, 9, 7};
        sort.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
