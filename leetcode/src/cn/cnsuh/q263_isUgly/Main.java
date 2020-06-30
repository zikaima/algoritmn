package cn.cnsuh.q263_isUgly;

public class Main {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(isUgly(num));
    }

    static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        int[] arr = {2, 3, 5};
        for (int i = 0; i < arr.length; i++) {
            while (num % arr[i] == 0) {
                num /= arr[i];
            }
        }
        return 1 == num;
    }
}
