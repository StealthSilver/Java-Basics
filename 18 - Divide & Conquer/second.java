// Quick sort
// time complexity O(n^2) , av time O(nlogn)
// space complexity O(1)

public class second {

    public static void quickSort(int arr[], int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }

        // pivot -> last element

        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx - 1); // left
        quickSort(arr, pidx + 1, ei);// right

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for elements smaller then the pivot

        for (int j = 0; i < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
