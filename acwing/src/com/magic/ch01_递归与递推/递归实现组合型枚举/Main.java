package com.magic.ch01_递归与递推.递归实现组合型枚举;

import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] stat;
    static boolean[] flag;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        stat = new int[m + 5];
        flag = new boolean[n + 5];
        dfs(1, 1);
    }

    private static void dfs(int u, int start) {
        if (u + n - start < m) {
            return;
        }
        if (u > m) {
            for (int i = 1; i <= m; i++) {
                System.out.print(stat[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= n; i++) {
            stat[u] = i;
            dfs(u + 1, i + 1);
        }
    }
}
