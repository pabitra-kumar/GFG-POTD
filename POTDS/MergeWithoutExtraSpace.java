import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        long arr1[] = { 1, 3, 5, 7 };
        long arr2[] = { 0, 2, 6, 8, 9 };
        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr1) + '\n' + Arrays.toString(arr2));
    }

    public static void merge(long arr1[], long arr2[], int n, int m) {
        int i = n - 1;
        int j = 0;
        while (i >= 0 && j < m) {

            if (arr1[i] > arr2[j]) {

                swap(arr1, i, arr2, j);
                i--;
                j++;
            } else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    static void swap(long[] arr1, int i, long[] arr2, int j) {
        long temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
}
