package com.magic.ch01_递归与递推.递归实现指数型枚举;

import java.util.Scanner;

public class Main {
    static int n;
    static boolean[] flag = new boolean[20];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        dfs(1);
    }

    private static void dfs(int u) {
        if(u > n){
            for(int i = 1 ;i <= n ; i++){
                if(flag[i]){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
            return;
        }

        flag[u] = false;
        dfs(u+1);
        flag[u] = true;
        dfs(u+1);
    }
}
