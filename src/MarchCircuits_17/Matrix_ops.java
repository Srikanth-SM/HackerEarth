package MarchCircuits_17;

import java.util.Scanner;

/**
 * Created by srikanth on 22-03-2017.
 */
public class Matrix_ops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();

            }

        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println("sdsd");
        }
    }
}
