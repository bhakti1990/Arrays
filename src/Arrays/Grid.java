/* Write a Java program to print the following grid. Go to the editor

Expected Output :
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -  */
package Arrays;
public class Grid {

    public static void main(String[] args) {
        int[][] my_array = new int[10][10];

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.print(" " + my_array[i][j]);
            }
           System.out.println();
        }
    }
}
