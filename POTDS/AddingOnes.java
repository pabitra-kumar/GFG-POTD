import java.util.*;

public class AddingOnes {
    public static void main(String[] args) {
        int a[] = {0,0,0};
        int updates[] = {1,1,2,3};
        update(a, a.length, updates, updates.length);
        System.out.println(Arrays.toString(a));
    }
    public static void update(int a[], int n, int updates[], int k)
    {
        for(int i : updates)
        {
            a[i-1]++;
        }
        int num = 0;
        for(int i=0 ; i < n ; i++)
        {
           num += a[i];
           a[i] = num;
        }
    }
}
