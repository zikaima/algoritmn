package com.magic.ch01_递归与递推.费解的开关;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    static char[][] map = new char[6][6];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
                map[j] = br.readLine().toCharArray();
            }
            pw.print(work() + "\n");

            if (i < n) {
                br.readLine();
            }
        }
        br.close();
        pw.flush();
        pw.close();
    }

    private static int work() {
        int ans = 100000, res;
        char[][] backup = new char[6][6];
        for (int i = 0; i < 5; i++) {
            backup[i] = map[i].clone();
        }

        for (int x = 0; x < 32; x++) {
            res = 0;
            for (int i = 0; i < 5; i++) {
                if (((x >> i) & 1) == 0) {
                    res++;
                    turn(0, i);
                }
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    if (map[i][j] == '0') {
                        res++;
                        turn(i + 1, j);
                    }
                }
            }
            boolean flag = true;
            for (int j = 0; j < 5; j++) {
                if (map[4][j] == '0') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans = Math.min(ans, res);
            }
            for (int i = 0; i < 5; i++) {
                map[i] = backup[i].clone();
            }


        }

        return ans > 6 ? -1 : ans;
    }

    private static void turn(int x, int y) {
        // 中 上 右 下 左
        int[] dx = {0, 0, 1, 0, -1};
        int[] dy = {0, 1, 0, -1, 0};

        int a, b;
        for (int i = 0; i < 5; i++) {
            a = x + dx[i];
            b = y + dy[i];
            if (a >= 0 && a < 5 && b >= 0 && b < 5) {
                map[a][b] ^= 1;
            }
        }
    }
}
