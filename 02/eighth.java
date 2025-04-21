// taking the input from the user

// importing the package which contains the scanner class
import java.util.*;

public class eighth {
    public static void main(String args[]) {
        // creating the new object from the scanner class
        Scanner sc = new Scanner(System.in);

        // getting the single input from the user
        String input = sc.next();
        System.out.println(input);

        // to get the complete line as the input
        String newInput = sc.nextLine();
        System.out.println(newInput);
    }
}
