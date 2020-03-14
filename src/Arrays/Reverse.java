/*11. Write a Java program to reverse an array of integer values. Go to the editor

*/
package Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args)
    {
        int[] x = {1,5,4,3};
        System.out.println("Original Array: " + Arrays.toString(x));

        for(int i =0; i<x.length/2; i++) {
            int temp = x[i];
            x[i] = x[x.length - i - 1];
            x[x.length - i - 1] = temp;
        }
        System.out.println("Reverse String : " + Arrays.toString(x));

    }

}
