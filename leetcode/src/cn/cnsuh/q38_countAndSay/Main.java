package cn.cnsuh.q38_countAndSay;

import java.util.Scanner;

/**
 * @author Magic
 * @create 2020-07-03 21:17
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = countAndSay(n);
        System.out.println(s);
    }

    static String countAndSay(int n) {
        String str = "";
        String res = "1";

        for (int i = 1; i < n; i++) {
            str = res;
            res = "";
            for (int j = 0; j < str.length(); ) {
                int cnt = 0, k = j;
                while (k < str.length() && str.charAt(k) == str.charAt(j)) {
                    k++;
                    cnt++;
                }
                res+=cnt;
                res+=str.charAt(j);
                j = k;
            }
        }
        return res;
    }
}
