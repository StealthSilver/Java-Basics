// input, putput and update in array

import java.util.*;

public class second {
    public static void main(String args[]) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println(marks);
        System.out.println("Phy marks: " + marks[0]);
        System.out.println("Chem marks: " + marks[1]);
        System.out.println("Mat marks: " + marks[2]);
    }
}
