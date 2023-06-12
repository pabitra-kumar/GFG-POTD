import java.util.*;

public class RodCutting {
    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int res = cutRod(price , price.length);
        System.out.println(res);
    }
    public static int cutRod(int price[], int n) {
        int[][] dp = new int[n][n+1];
        for(int i = 0 ; i < dp.length ; i++)
        {
            Arrays.fill(dp[i] , -1);
        }
        return f(0,price,n,n,dp);
    }
    public static int f(int i , int[] price , int rodLen , int n , int[][] dp)
    {
        // Base Case
    if(rodLen==0) return 0;
    if(i==n) return Integer.MIN_VALUE;

    if(dp[i][rodLen]!=-1) return dp[i][rodLen];

    // Take or Nottake
    int nottake=f(i+1,price,rodLen,n,dp);
    int take=Integer.MIN_VALUE;
    if(rodLen>=(i+1))
    take=price[i]+f(i,price,rodLen-(i+1),n,dp);

    // return maximum out of them
    return dp[i][rodLen]=Math.max(take,nottake);
    }
}