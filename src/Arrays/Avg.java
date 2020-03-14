/* Write a Java program to calculate the average value of array elements*/

package Arrays;
public class Avg {

    public static void main(String[] args) {
        int[] x = new int []{2, 5, 3, 6, 8, -4};
        int sum =0;

        for (int i =0; i< x.length; i++)
            sum = sum + x[i];
            double avg = sum / x.length;
            System.out.println("average of the array elements is " + avg);
    }
}
