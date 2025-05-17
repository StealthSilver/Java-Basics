// Linear search on strings

public class fifth {

    public static int linearSearch(String fruits[], String key) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        String fruits[] = { "Mango", "Apple", "Orange", "Guave" };
        String key = "Orange";

        int index = linearSearch(fruits, key);

        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("the key is present at index : " + index);
        }

    }
}
