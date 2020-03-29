// package dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * BishuAndHisGirlFriend
 */
public class BishuAndHisGirlFriend {
    static int[] distance;
    static boolean[] visited;
    static ArrayList<Integer>[] adjList;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<Integer>();
            // System.out.println(adjList[i]);
        }
        while (N-- > 1) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            adjList[a].add(b);
            adjList[b].add(a);
        }
        int Q = scan.nextInt();
        int[] girl = new int[adjList.length];

        while (Q-- > 0) {
            girl[scan.nextInt()]++;
        }

        distance = new int[adjList.length];
        visited = new boolean[adjList.length];
        dfs(1, 0);
        for (int i = 1; i < girl.length; i++) {
            if (girl[i] > 0) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void dfs(int source, int level) {
        visited[source] = true;
        distance[source] = level;
        for (int vertex : adjList[source]) {
            if (!visited[vertex]) {
                dfs(vertex, level + 1);
            }
        }
    }
}