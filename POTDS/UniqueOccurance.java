import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurance {
    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 5, 5, 4, 4, 3, 3, 7, 7, 7, 4, 4};
        int n  = arr.length;
        boolean ans = isFrequencyUnique(n, arr);
        System.out.println(Arrays.toString(arr) + '\n' +(ans ? "Yes" : "No"));
    }
    public static boolean isFrequencyUnique(int n, int[] arr) {
        HashMap<Integer , Integer> m = new HashMap<>();
        for(int i : arr)
        {
            if(m.containsKey(i)) m.put(i , m.get(i)+1);
            else
            m.put(i , 1);
        }
        Set<Integer> s = new HashSet<>();
        for(Map.Entry<Integer , Integer> i : m.entrySet())
        {
            s.add(i.getValue());
        }
        return m.size() == s.size();
    }
}