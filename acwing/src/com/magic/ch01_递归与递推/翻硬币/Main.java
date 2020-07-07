package com.magic.ch01_递归与递推.翻硬币;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        char[] begin = br.readLine().toCharArray();
        char[] end = br.readLine().toCharArray();
        br.close();
        int cnt = 0;
        for (int i = 0; i < begin.length; i++) {
            if (begin[i] != end[i]) {
                cnt++;
                begin[i] = end[i];
                if (begin[i + 1] == 'o') {
                    begin[i + 1] = '*';
                } else {
                    begin[i + 1] = 'o';
                }
            }
        }
        pw.print(cnt);
        pw.flush();
        pw.close();

    }
}
