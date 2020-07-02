package cn.cnsuh.q178_kthSmallest;

import java.util.Arrays;

/**
 * @author Magic
 * @create 2020-07-02 14:12
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{5}};
        System.out.println(kthSmallest(matrix, 1));

    }

    static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] arr = new int[n * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[index++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
