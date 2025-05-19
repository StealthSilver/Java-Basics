// merge sort 
// time complexity (nlogn)

public class first {

    public static void mergeSort(int arr[], int si, int ei) {
        // mid

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid); // left
        mergeSort(arr, mid + 1, ei); // right
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
