public class MaximumIndex {
    public static void main(String[] args) {
        MaximumIndex ob = new MaximumIndex();
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int res = ob.maxIndexDiff(arr , arr.length);
        System.out.println(res);
    }
    int maxIndexDiff(int arr[], int n) {
        int i = 0 , j = n-1 , diff = 0;
        while(i < j)
        {
            if(arr[i] <= arr[j])
            {
                diff = Math.max(diff , j-i);
                i++;
                j= n-1;
            }
            else
            {
                j--;
            }
        }
        return diff;
    }
}
