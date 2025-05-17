// input, putput and update in array

import java.util.*;

public class second {
    public static void main(String args[]) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // this will return the address of the head of the array
        System.out.println(marks);
        System.out.println("Phy marks: " + marks[0]);
        System.out.println("Chem marks: " + marks[1]);
        System.out.println("Mat marks: " + marks[2]);

        // updating

        marks[2] = marks[2] + 1;
        marks[1] = 43;

        System.out.println("Chem marks: " + marks[1]);
        System.out.println("Mat marks: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + percentage + "%");

        // length of the array
        System.out.println("length of array = " + marks.length);
    }
}
