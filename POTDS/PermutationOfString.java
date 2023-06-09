import java.util.*;


public class PermutationOfString {
    public static void main(String[] args) {
        System.out.println(find_permutation("CAB")); // Input
    }
    public static List<String> find_permutation(String S) {

        List<String> res = new ArrayList<>();

        HashSet<String> set = new HashSet<>();

        int n = factorial(S.length()) ;
        set.add(S);
        for(int i = 0 ; i < n ; i++)
        {
            S = nextPermutation(S);
            set.add(S);
        }
        
        for(String t : set)
        res.add(t);
        Collections.sort(res);
        return res;
    }

    public static int factorial(int n)
    {
        if(n<=1) return 1;
        return factorial(n-1)*n;
    }

    public static String nextPermutation(String S) {
        int bg =0 , sm=0 ;
        for(int i =S.length()-2 ; i>=0 ; i--)
        {
            if((int)S.charAt(i)< (int)S.charAt(i+1))
            {
                bg = i+1 ;
                sm = i;
                break;
            }
        }
        for(int i =S.length()-1 ; i>=bg ; i--)
        {
            if(S.charAt(i)>S.charAt(sm))
            {
                S = swap(S , i , sm);
                break;
            }
        }
         S = reverse(S , bg);
         return S;
    }

    public static String swap (String S , int i , int j )
    {
        if(i==j) return S;
        char[] nums = S.toCharArray();

        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
        S = new String(nums);
        return S;
    }

    public static String reverse(String S , int j)
    {
        for(int i =j ; i<=(((S.length()-1-j)/2)+j) ; i++)
        {
            S = swap(S , i , S.length()-1-(i-j));
        }
        return S;
    }
}
