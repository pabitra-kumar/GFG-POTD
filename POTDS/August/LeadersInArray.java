package August;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int arr[] = { 16, 17, 3, 4, 5, 1, 2 };
        int n = arr.length;
        ArrayList<Integer> res = leaders(arr, n);
        System.out.println(res);
    }

    static ArrayList<Integer> leaders(int arr[], int n) {
        int max = arr[n - 1];
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            int j = arr[i];
            max = Math.max(j, max);
            if (max == j) {
                res.add(0, max);
            }
        }
        return res;
    }
}