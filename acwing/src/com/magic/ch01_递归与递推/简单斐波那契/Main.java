package com.magic.ch01_递归与递推.简单斐波那契;

import java.util.Scanner;

public class Main {

    static int[] dp = new int[50];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp[1] = 0;
        dp[2] = 1;
        System.out.print(dp[1]+" ");
        if(n>1){
            System.out.print(dp[2]+" ");
        }
        for(int i = 3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
            System.out.print(dp[i]+" ");
        }
    }
}
