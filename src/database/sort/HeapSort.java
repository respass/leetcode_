package database.sort;

/**
 * @Author: respass
 * @Date: 2018
 */
public class HeapSort {

    void down(int[] arr, int start, int end) {
        int cur = start;
        int l = 2 * cur + 1;
        int temp = arr[cur];
        for (; l <= end; cur = l, l = 2 * l + 1) {
            if (l < end && arr[l] < arr[l+1]) {
                l++;
            }


            if (temp >= arr[l]) {
                break;
            }else {
                arr[cur] = arr[l];
                arr[l] = temp;
            }
        }
    }

    void heapSort(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            down(arr, i, n-1);
        }

        for (int i = n-1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            down(arr, 0, i-1);
        }
    }

}
