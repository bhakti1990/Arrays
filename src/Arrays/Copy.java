/*Write a Java program to copy an array by iterating the array.*/
package Arrays;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args)
    {
        int[] x= {1,8,7,6,4};
        int[] y = new int[5];
        System.out.println("Original Array : " + Arrays.toString(x));

        for(int i = 0; i<x.length; i++)
        {
            y[i] = x[i];
        }
        System.out.println("Modified array" + Arrays.toString(y));
    }

}
