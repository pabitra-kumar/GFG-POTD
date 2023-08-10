package August;

public class LongestCommonSubSequence {
    public static void main(String[] args) {
        String s1 = "AXBDGHR";
        int x = s1.length();
        String s2 = "ARTDGPR";
        int y = s2.length();

        int res = lcs(x, y, s1, s2);

        System.out.println(res);

    }

    static int lcs(int x, int y, String s1, String s2) {

        // your code here

        int dp[][] = new int[x + 1][y + 1];

        for (int i = x; i >= 0; i--) {

            for (int j = y; j >= 0; j--) {

                if (i == x || j == y)
                    dp[i][j] = 0;

                else if (s1.charAt(i) == s2.charAt(j))
                    dp[i][j] = 1 + dp[i + 1][j + 1];

                else
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);

            }

        }

        return dp[0][0];

    }
}
