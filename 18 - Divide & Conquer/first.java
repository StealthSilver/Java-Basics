// merge sort 
// time complexity (nlogn)

public class first {

    public static void mergeSort(int arr[], int si, int ei) {

        // base case

        if (si >= ei) {
            return;
        }

        // mid
        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid); // left
        mergeSort(arr, mid + 1, ei); // right

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // for left part
        int j = mid + 1; // for right part
        int k = 0; // for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
    }
}
