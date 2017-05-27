package GraphTheory_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by srikanth on 22-03-2017.
 */
public class monk_and_hops {
    static int weight = 0, hops = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][] = new int[n][n];
        while (m-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            a[x - 1][y - 1] = in.nextInt();
            a[y - 1][x - 1] = a[x - 1][y - 1];
        }
        int dist[] = new int[n];
        int mark[] = new int[n];
        int u = -1;
        int path[] = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        while (true) {
            int x = Integer.MAX_VALUE;
            u = -1;
            for (int i = 0; i < n; i++) {
                if (mark[i] == 0 && x > dist[i]) {
                    x = dist[i];
                    u = i;
                }


            }
            if (u == -1) break;
            mark[u] = 1;
            for (int i = 0; i < n; i++) {
                if (u != i && a[u][i] > 0 && a[u][i] + dist[u] < dist[i]) {
                    dist[i] = a[u][i] + dist[u];
                    path[i] = u;
                }


            }
        }

        int visited[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                int count = Dfs(i, n, visited, a);
                if (weight == dist[n - 1] && hops >= count)
                    weight = 0;
                hops = count;
            }


        }

        System.out.println(dist[n - 1] + " " + hops);
//        System.out.println(Arrays.toString(path));
//        System.out.println(hops);

//        dist[0]=0;


    }

    private static int Dfs(int i, int n, int[] visited, int[][] a) {
        int prev = 0;
        int k = 0;
        return dfs(i, n, visited, a, prev, k);
    }

    private static int dfs(int i, int n, int[] visited, int[][] a, int prev, int k) {
        visited[i] = 1;
        for (int j = 0; j < n; j++) {
            if (visited[j] == 0 && a[i][j] > 0) {
                k += Math.abs(prev - a[i][j]) % 2 == 0 ? 0 : 1;
                prev = a[i][j];
                weight += a[i][j];
                dfs(j, n, visited, a, prev, k);
            }
        }
        return k;
    }
}
