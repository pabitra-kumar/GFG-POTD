package August;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        int N = 24;
        long ans = largestPrimeFactor(N);
        System.out.println(ans);
    }

    static long largestPrimeFactor(int N) {
        int ans = 2;
        for (int i = 2; i <= N; i++) {
            if (N == 1)
                return ans;

            while (N % i == 0)
                N /= i;

            ans = Math.max(ans, i);
        }
        return ans;
    }
}
