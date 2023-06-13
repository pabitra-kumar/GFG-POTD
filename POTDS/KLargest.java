import java.util.*;

public class KLargest {
    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int[] ans = kLargest(arr, arr.length , 3);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] kLargest(int[] arr, int n, int k) {
        int[] ans = new int[k];
        Arrays.sort(arr);
        for(int i = n-1 ; i > n-1-k ; i--)
        {
            ans[n-1-i] = arr[i];
        }
        return ans;
    }
}