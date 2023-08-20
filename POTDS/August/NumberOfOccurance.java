package August;

public class NumberOfOccurance {
    public static void main(String[] args) {
        NumberOfOccurance ob = new NumberOfOccurance();
        int arr[] = { 1, 1, 2, 2, 2, 2, 3 };
        int n = arr.length;
        int x = 2;
        System.out.println(ob.count(arr, n, x));
    }

    int count(int[] arr, int n, int x) {
        int i = 0;
        while (i < n && arr[i] != x) {
            i++;
        }
        int cnt = 0;
        while (i < n && arr[i] == x) {
            cnt++;
            i++;
        }
        return cnt;

    }
}
