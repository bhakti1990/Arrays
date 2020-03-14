/*12. Write a Java program to find the duplicate values of an array of integer values. Go to the editor

*/
package Arrays;

import java.util.Arrays;

public class DuplicateInt {
    public static void main(String[] args) {
        int[] x = {5, 7, 6, 3, 4, 5, 1, 9};
        System.out.println("Original array " + Arrays.toString(x));

        int index = 0;
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if ((x[i] == x[j]) && (i != j)) {
                    System.out.println("duplicate values are " + (x[j]));
                } }
        }
    }
}
