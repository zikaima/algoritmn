package cn.cnsuh.q60_getPermutation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n个数
        int k = sc.nextInt();//第k个排序

        String res = getPermutation(n, k);
        System.out.println(res);

    }


    static String getPermutation(int n, int k) {
        //存放阶乘
        int[] f = new int[n];
        f[0] = 1;
        for(int i = 1 ; i < n ; i++){
            f[i] = f[i-1] * i;
        }
        List<Integer> nums = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            nums.add(i);
        }
        k--;
        StringBuilder sb = new StringBuilder();
        for(int i = n - 1 ; i>=0 ; i--){
            int index = k / f[i];
            sb.append(nums.get(index));
            nums.remove(index);
            k%=f[i];
        }
        return sb.toString();
    }


}
