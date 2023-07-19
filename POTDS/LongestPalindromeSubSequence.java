public class LongestPalindromeSubSequence {
    public static void main(String[] args) {
        String A = "bbabcbcab";
        LongestPalindromeSubSequence ob = new LongestPalindromeSubSequence();
        int ans = ob.longestPalinSubseq(A);
        System.out.println(ans);
    }
    public int longestPalinSubseq(String A)
    {
        int n = A.length();
        int[][] dp = new int[n][n];
        
        for (int i = 0; i < n; i++)
            dp[i][i] = 1;
        
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (A.charAt(i) == A.charAt(j)) {
                    if (i == j - 1)
                        dp[i][j] = 2;
                    else
                        dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        
        return dp[0][n - 1];
    }
}
