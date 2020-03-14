/*Java Array Exercises: Find the duplicate values of an array of string values
*/
package Arrays;

import java.util.Arrays;

public class DuplicateString {

    public static void main(String[] args)
    {
        String[] x = { "akka", "kiwi", "didi", "bkt", "chin", "kiwi"};
        System.out.println("Original Array: " + Arrays.toString(x));

        for(int i = 0; i<x.length; i++)
        {
            for(int j = i+1;j<x.length; j++)
            {
                if((x[i] ==x[j] && i!=j))
                    System.out.println("Duplicate values are " + x[j]);
            }
        }

    }

}
