// Linear search 

public class forth {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 3, 4, 5, 6, 87, 10, 45, 34 };
        int key = 1420;

        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("the key is present at index : " + index);
        }

    }
}
