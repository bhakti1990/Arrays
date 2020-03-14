/*Write a Java program to insert an element (specific position) into an array*/

package Arrays;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int[] x = {7, 9, 6, 3, 4, 5};
      //  int[] y = new int[7];
        System.out.println("Original Array :" + Arrays.toString(x));

        int index_new_position = 3;
        int new_value = 12;

        for (int i = x.length -1; i > index_new_position; i--) {
            x[i] = x[i - 1];
        }
        x[index_new_position] = new_value;
        System.out.println("Modified Array :" + Arrays.toString(x));
    }
}
