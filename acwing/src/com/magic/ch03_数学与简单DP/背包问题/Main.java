package com.magic.ch03_数学与简单DP.背包问题;

import java.util.Scanner;

public class Main {
    static int N = 1010;
    static int[][] dp = new int[N][N];
    static int[] v = new int[N];//体积
    static int[] w = new int[N];//价值
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= v[i]) {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-v[i]]+w[i]);
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}
