public class IsBinaryNumberMultipleOf3 {
    public static void main(String[] args) {
        String s = "101011101011101";
        System.out.println(isDivisible(s));
    }
    static int isDivisible(String s) {
        int even = 0 , odd = 0 ;
        int j = 0;
        for(char k : s.toCharArray())
        {
            if(k=='1')
            {
                if(j==0)
                odd++;
                else
                even++;
            }
            j = j==0 ? 1 : 0 ;
        }
        int max = Math.max(even , odd);
        int min = Math.min(even , odd);
        return (max-min)%3 == 0 ? 1 : 0 ;
    }
}
