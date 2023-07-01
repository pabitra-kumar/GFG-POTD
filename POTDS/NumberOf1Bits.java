public class NumberOf1Bits {
    public static void main(String[] args) {
        int N = 39;
        System.out.println(setBits(N));
    }
    static int setBits(int N) {
        int c = 0 ;
        while(N != 0)
        {
            int to = 0;
            while( (long)Math.pow(2 , to) <= (long)N)
            {
                to++;
            }
            N = N - (int)Math.pow(2 , to-1) ;
            c++;
        }
        return c;
    }
}
