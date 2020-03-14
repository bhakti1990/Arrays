/*10. Write a Java program to find the maximum and minimum value of an array.
*/
package Arrays;

import java.util.Arrays;

public class MinMax {
    static int min, max;
    public static void main(String[] args)
    {
        int[] x = {5,6,3,8,7,9,2};
        min_max(x);
        System.out.println("Original Array:" + Arrays.toString(x));
        System.out.println("Minimum Array:" + min);
        System.out.println("Maximum Array:" + max);
    }

    public static void min_max(int x[])
    {
        min = x[0];
        max = x[0];

        for(int i= 1; i< x.length -1; i = i+2) {
            if (i +1 > x.length) {
                if (x[i] > max) max = x[i];
                if (x[i] < min) min = x[i];
            }
            if (x[i] > x[i + 1]) {
                {
                    if (x[i] > max) max = x[i];
                    if (x[i + 1] < min) min = x[i + 1];
                }
            if(x[i] < x[i+1]){
                if(x[i+1] > max)max = x[i +1];
                if(x[i] < min) min = x[i];
            }
            }
        }
    }
}
