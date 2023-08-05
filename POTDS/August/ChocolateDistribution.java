package August;

import java.util.*;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 9, 56, 7, 9, 12 };

        ArrayList<Integer> a = new ArrayList<>();
        for (int i : arr)
            a.add(i);

        int m = 5;

        ChocolateDistribution ob = new ChocolateDistribution();

        long ans = ob.findMinDiff(a, a.size(), m);

        System.out.println(ans);
    }

    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        Collections.sort(a);
        int min = Integer.MAX_VALUE;
        for (int i = m - 1; i < n; i++) {
            int j = a.get(i) - a.get(i + 1 - m);
            if (j < min)
                min = j;
        }
        return (long) min;
    }
}
