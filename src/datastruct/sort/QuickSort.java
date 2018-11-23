package datastruct.sort;

/**
 * @Author: respass
 * @Date: 2018
 */
public class QuickSort {
    public void quickSort(int[] arr, int l, int r) {

        int i = l;
        int j = r;
        int temp = arr[l];
        if (l > r) {
            return;
        }

        while (i != j) {
            while (i < j && arr[j] >= temp)
                j--;
            if (j > i) {
                arr[i] = arr[j];
            }

            while (i < j && arr[i] <= temp)
                i++;

            if (i < j) {
                arr[j] = arr[i];
            }
        }
        arr[i] = temp;
        quickSort(arr, l, i-1);
        quickSort(arr, r+1, r);
    }

}
