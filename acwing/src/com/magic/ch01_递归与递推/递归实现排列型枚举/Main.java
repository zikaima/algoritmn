package com.magic.ch01_递归与递推.递归实现排列型枚举;

import java.util.Scanner;

public class Main {
    static boolean[] flag = new boolean[15];
    static int[] stat = new int[15];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        dfs(1);
    }

    private static void dfs(int u) {
        if (u > n) {
            for(int i = 1 ; i<=n;i++){
                System.out.print(stat[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i = 1 ; i <= n ; i++){
            if(!flag[i]){
               stat[u] = i;
               flag[i] = true;
               dfs(u+1);
               flag[i] = false;
            }
        }
    }
}
