/*Write a Java program to sum values of an array*/

package Arrays;

public class Sum {

    public static void main(String[] args)
    {
        int[] x = { 4,2,6,1};
        int sum_of_array = 0;

        for(int i : x)
            sum_of_array += i;
       System.out.println("sum of arrays is " + sum_of_array);
    }


}
