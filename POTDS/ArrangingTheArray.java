import java.util.*;


public class ArrangingTheArray {
    public static void main(String[] args) {
        int[] arr = {-3, 3, -2, 2};
        Rearrange(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void Rearrange(int a[], int n)
    {
        
        int[] temp = new int[n];
        
        int k = 0 ;
        
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] < 0)
            temp[k++] = a[i] ;
        }
        
        
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] >= 0)
            temp[k++] = a[i] ;
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = temp[i] ;
        }
        
    }
}
