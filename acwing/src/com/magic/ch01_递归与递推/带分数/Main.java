package com.magic.ch01_递归与递推.带分数;

import java.util.Scanner;

public class Main {
    static int n;
    static boolean[] used = new boolean[10];
    static int[] stat = new int[10];
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        dfs(1);
        System.out.println(ans);
    }

    private static void dfs(int u) {
        if (u > 9) {
            check();
            return;
        }

        for(int i = 1 ; i <= 9 ; i++){
            if(!used[i]){
                stat[u] = i;
                used[i] = true;
                dfs(u+1);
                used[i] = false;
            }
        }

    }

    private static void check() {
        for(int i = 1 ; i <=7 ; i++){
            int num1 = toInt(1,i);
            if(num1>=n){
                continue;
            }
            for(int j = i+1;j<=8;j++){
                int num2 = toInt(i+1,j);
                int num3 = toInt(j+1,9);
                if(num2%num3==0&&num1+num2/num3==n){
                    ans++;
                }
            }
        }
    }

    private static int toInt(int l, int r) {
        int num = 0;
        for(int i = l ; i<=r;i++){
            num*=10;
            num+=stat[i];
        }
        return num;


    }
}
