// reversing an array by creating a new array

public class ninth {

    public static int[] reverse(int[] original) {
        int length = original.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = original[length - 1 - i];
        }

        return reversed;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        int[] reversedArray = reverse(numbers);

        // Print reversed array
        System.out.print("Reversed Array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
