/*Write a Java program to remove a specific element from an array*/
package Arrays;

import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        int[] x = {1, 6, 8, 9, 3};
        System.out.println("original array" + Arrays.toString(x));

        int index = 1;
        for(int i = index; i<x.length -1; i++)
        {
            x[i] = x[i+1];

        }
        System.out.println("array after removing" + Arrays.toString(x));
    }

    }
