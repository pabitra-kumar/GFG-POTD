import java.util.HashMap;

public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int ans = missingNumber(arr , arr.length);
        System.out.println(ans);
    }
    static int missingNumber(int arr[], int size)
    {
        HashMap<Integer , Integer> m = new HashMap<>();
        for(int i : arr)
        {
            if(i > 0)
            m.put(i , 1);
        }
        for(int i = 1 ; i <= size+1 ; i++)
        {
            if(!m.containsKey(i))
            {
                return i;
            }
        }
        return 1;
    }
}
