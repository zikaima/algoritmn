package cn.cnsuh.q189_RotateArray;

import java.util.Arrays;

/**
 * @author Magic
 * @create 2020-06-24 15:08
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);

        String s = Arrays.toString(nums);
        System.out.println(s);
    }

    static void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] res = new int[len];
        for(int i = 0 ; i < len ; i++){
            res[(i+k)%len] = nums[i];
        }
        for(int i = 0 ; i < len ; i++){
            nums[i] = res[i];
        }
    }
}
