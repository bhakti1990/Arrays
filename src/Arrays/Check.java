/*Write a Java program to test if an array contains a specific value*/

package Arrays;

public class Check {

    public static void main(String[] args) {
        int[] x = {2015, 526, 8563, 2014, 7563, 4632};
        System.out.println(contains(x, 7563));
    }

    public static boolean contains(int[] arr, int item) {

        for (int n : arr) {
            if (item == n) {
                /*here the statement for(int n:arr) is a new type of for loop called for each loop.
what it does is , it assign the value of n according to the element present in array arr[]( name of array in example above).
For the first time the value of n will be the element present at the 0th index of the array(in this case, 2015) and after the
compilation of this loop i will be 2014 then 7563 till 4632(last element of the array).*/
                return true;
            }
        }
        return false;
    }
}