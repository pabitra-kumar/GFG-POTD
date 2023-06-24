
public class PrefixMatchString {
    public static void main(String[] args) {
        String[] arr = {"abb", "abbb", "abbc", "abbd", "abaa", "abca"};
        String str = "abbg";
        System.out.println(klengthpref(arr, arr.length, 3, str));
    }
    public static int klengthpref(String[] arr, int n, int k, String str)
    {
        int res = 0;
        if(str.length() < k) return 0;
        String s = str.substring(0,k);
        for(String i : arr)
        {
            if(k > i.length()) continue;
            String j = i.substring(0,k);
            if( j.equals(s) )
            {
                res++;
            }
        }
        return res;
    }
}