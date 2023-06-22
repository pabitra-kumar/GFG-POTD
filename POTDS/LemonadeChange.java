
public class LemonadeChange {
    public static void main(String[] args) {
        int[] bills = {5 , 5 , 10 , 10 , 20};
        System.out.println(lemonadeChange(bills.length , bills));
    }
    static boolean lemonadeChange(int N, int bills[]) {
        int i5 = 0 , i10 = 0 ;
        for(int i = 0 ; i < N ; i++)
        {
            int j = bills[i];
            
            if(j==20)
            {
                if(i5 > 0 && i10 > 0)
                {
                    i5 -- ; i10 --;
                }
                else if(i5 >= 3)
                i5 = i5 - 3 ;
                else
                return false;
            }
            else if(j == 10)
            {
                if(i5 >= 1)
                i5--;
                else
                return false;
                
                i10++;
            }
            else if(j== 5)
            {
                i5++;
            }
        }
        return true;
    }
}