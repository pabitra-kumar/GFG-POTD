
public class SpiralMatrix {
    public static void main(String[] args) {
        int A[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int n = A.length;
        int m = A[0].length;
        int k = 12;
        int ans = findK(A, n, m, k);
        System.out.println("element of seriel number " + k + " in the spiral matrix is: "+ ans);

    }

    static int findK(int A[][], int n, int m, int k) {
        int count = m;
        int i = 0, j = m - 1;
        if (k <= m)
            return A[0][k - 1];
        m = m - 1;
        n = n - 1;
        int l = 0;
        while (true) {
            if (l == 0) {
                for (int ind = 1; ind <= n; ind++) {
                    i++;
                    count++;
                    if (count >= k)
                        return A[i][j];
                }
                for (int ind = 1; ind <= m; ind++) {
                    j--;
                    count++;
                    if (count >= k)
                        return A[i][j];
                }
                l = 1;
                n--;
                m--;
            } else {
                for (int ind = 1; ind <= n; ind++) {
                    i--;
                    count++;
                    if (count >= k)
                        return A[i][j];
                }
                for (int ind = 1; ind <= m; ind++) {
                    j++;
                    count++;
                    if (count >= k)
                        return A[i][j];
                }
                l = 0;
                n--;
                m--;
            }

        }

    }
}