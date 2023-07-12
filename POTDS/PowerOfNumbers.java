public class PowerOfNumbers {
    public static void main(String[] args) {
        int N = 12;
        int R = reverse(N);
        System.out.println("Number is: "+ N + "\n It's Reverse is: "+ R);
        long ans = power(N, R);
        System.out.println("Answer is: "+ ans);
    }
    static long power(int N,int R)
    {
        long k = (long)Math.pow(10,9) + 7L;
        
        if(R == 1) return N;
        
        if(R % 2 == 0)
        {
            long res = (long)N* (long)N;
            res = res % k;
            return power((int)res , R/2);
        }
        else
        {
            long res = N * power(N , R-1);
            res = res % k;
            return res;
        }
        
    }
    static int reverse(int N)
    {
        int n = N;
        int R = 0;
        while(n != 0)
        {
            R = R*10 + n % 10;
            n = n/10;
        }
        return R;
    }
}
