/*Write a Java program to find the index of an array element*/

package Arrays;

public class index {
public static void main(String[] args)
{
    int[] x = new int[]{1,5,6,8,7};

    System.out.println("Index position of 8 is  "  + findindex(x,8));

}
    public static int findindex(int[] x, int t)
    {
        if(x == null)
            return -1;
        int len = x.length;
        int i =0;
        while(i<len) {
            if (x[i] == t)
                return i;
            else
                i = i + 1;
        }
        return -1;
       }
    }

