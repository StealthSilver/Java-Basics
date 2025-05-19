// Counting sort
// time complexity O(n + range)

public class sixth {
    public static void main(String args[]) {

    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting step
        for (int i = 0; i < count.length; i++) {

        }
    }
}
