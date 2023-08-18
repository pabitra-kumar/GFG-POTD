package August;

public class NthCatalanNo {
    public static void main(String[] args) {
        int n = 5;
        int res = findCatalan(n);
        System.out.println(n + " Catalan Number is : " + res);
    }

    public static int findCatalan(int n) {
        if (n == 0) {
            return 1;
        }
        final int MOD = (int) (1e9 + 7);
        long[] v = new long[n + 1];
        v[0] = v[1] = 1;

        for (int i = 2; i <= n; ++i) {
            for (int j = 0; j < i; ++j) {
                v[i] = (v[i] + (v[j] * v[i - j - 1]) % MOD) % MOD;
            }
        }
        return (int) v[n];
    }
}
