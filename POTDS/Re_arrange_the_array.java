import java.util.*;

public class Re_arrange_the_array {
    public static void main(String[] args){
        long arr[] = {4,0,2,1,3};
        arrange(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void arrange(long arr[], int n)
    {
        lobby(arr , 0);
    }
    static void lobby(long arr[] , int i)
    {
        long temp = arr[(int)arr[i]];
        if(i == arr.length - 1)
        {
           arr[i] = temp;
           return;
        }
        else
        {
            lobby(arr , i+1);
            arr[i] = temp;
            return;
        }
    }
}