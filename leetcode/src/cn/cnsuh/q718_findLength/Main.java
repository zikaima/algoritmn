package cn.cnsuh.q718_findLength;

public class Main {
    public static void main(String[] args) {
        int[] A = {1,2,3,2,1};
        int[] B = {3,2,1,4,7};

        System.out.println(findLength(A,B));
    }

    static int findLength(int[] A, int[] B) {
        int ans = 0;
        if(A.length==0 || B.length==0){
            return 0;
        }
        int[][] dp = new int[A.length+10][B.length+10];
        for(int i = 1 ;i <= A.length ; i++){
            for(int j = 1 ; j<=B.length;j++){
                if(A[i-1] == B[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = 0;
                }
                ans = Math.max(ans,dp[i][j]);
            }
        }
        return ans;
    }
}
