public class SubArrayProductLessK {
    public static void main(String[] args) {
        long[] arr = {2 , 5 , 8 , 1};
        long k = 10;
        int res = countSubArrayProductLessThanK(arr, arr.length, k);
        System.out.println(res);
    }
    public static int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        int j = 0 , count  = 0;
        long product = 1;
        if(k == 1)
        return 0;
        for(int i = 0 ; i < n ; i++)
        {
            product *= a[i];
            if(product >= k)
            {
                while(product >= k && j <= i)
                {
                    product /= a[j];
                    j++;
                }
            }
            count += i-j+1;
        }
        return count;
    }
}
