public class CopySetBitsInRange {
    public static void main(String[] args) {
        int x = 44 ;
        int y = 3;
        int l = 2;
        int r = 5;
        System.out.println(setSetBit(x, y, l, r));
    }
    static int setSetBit(int x, int y, int l, int r){
        int n = 0;
        while(y != 0)
        {
            int to = 0;
            while( (long)Math.pow(2 , to) <= (long)y)
            {
                to++;
            }
            y = y - (int)Math.pow(2 , to-1) ;
            if(to >= l && to <= r)
            n += (int)Math.pow(2 , to-1);
        }
        return x|n ;
    }
}
