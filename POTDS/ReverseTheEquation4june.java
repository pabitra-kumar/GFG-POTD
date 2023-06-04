import java.util.*;

public class ReverseTheEquation4june {
    public static void main(String[] args) {
        String S = "5+2*56-2/4" ;
        System.out.println(reverseEqn(S));
    }
    static String reverseEqn(String S)
    {
        int n = S.length();
        ArrayList<String> arr = new ArrayList<>();

        for(int j = n-1 ; j >= 0 ; j-- )
        {
            int i = j;
            while(j >= 0 && S.charAt(j) != '+' && S.charAt(j) != '-' && S.charAt(j) != '*' && S.charAt(j) != '/')
            {
                j--;
            }
            arr.add(S.substring(j+1, i+1));
            if(j>0)
            arr.add(S.substring(j, j+1));
        }
        
        S = String.join("", arr);

        return S;
    }
}