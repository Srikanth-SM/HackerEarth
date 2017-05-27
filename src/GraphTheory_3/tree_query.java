package GraphTheory_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by srikanth on 22-03-2017.
 */
public class tree_query {
    //    static int weight=0,hops=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] marked = new int[n];
        int a[][] = new int[n][n];
        System.out.println("hai");

        int count = n;
        while (m-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            a[x - 1][y - 1] = 1;
            if (marked[y - 1] == 0 && a[x - 1][y - 1] > 0) {
                marked[y - 1] = 1;
                count--;
            }

        }
        System.out.println(count);
    }
}