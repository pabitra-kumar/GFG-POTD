
public class longestPalindromeInString {
    public static void main(String[] args) {
        String s ="aaaaabbaa";
        System.out.println(longestPalin(s));
    }
    static String longestPalin(String s){
        String res = "";
        for(int i = 0 ; i < s.length() ; i++)
        {
            for(int j = i + res.length() ; j < s.length() ; j++)
            {
                if(check(s , i , j))
                {
                    if(j-i+1 > res.length())
                    {
                        res = s.substring(i , j+1);
                    }
                }
            }
        }
        
        return res;
        
    }
    public static boolean check(String s , int i , int j)
    {
        for(int k = i ; k <= (i+j)/2 ; k++)
        {
            if(s.charAt(k) != s.charAt(j-(k-i)))
            return false;
        }
        return true;
    }
}