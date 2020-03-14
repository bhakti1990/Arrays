/*Write a Java program to sort a numeric array and a string array. */

package Arrays;
import java.util.Arrays;
public class Sort {

    public static void main(String[] args)
    {
        int[] my_array_01 = { 1256, 1289, 896, 6354, 7456, 8321, 1111 , 456};
        String[] my_array_02 = {"bkt", "chinx", "akka", "kiwi","didi"};

        System.out.println("Numeric Array before sorting is " + Arrays.toString(my_array_01));
        Arrays.sort(my_array_01);
        System.out.println("Numeric Array after sorting is " + Arrays.toString(my_array_01));

        System.out.println("String array before sorting is " + Arrays.toString(my_array_02));
       Arrays.sort(my_array_02);
        System.out.println("Numeric Array after sorting is " + Arrays.toString(my_array_02));
    }

}
