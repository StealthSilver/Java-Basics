// Insertion sort
// Time complexity: O(n^2) in worst case, O(n) in best case

public class third {

    public static void insertionSort(int arr[]) {
        // outer loop
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // finding the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // insertion
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 1, 3, 2, 4 };
        insertionSort(arr);
        printArr(arr);
    }
}