import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 9, 7};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int arr[], int low, int high)
    {
        if(low>=high) return;
        // code here
        int p=partition(arr,low,high);
        quickSort(arr,low,p-1);
        quickSort(arr,p+1,high);
    }
    static int partition(int arr[], int low, int high)
    {
        // Your code here
       int pivot=arr[low];
       int cnt=0;
       for(int i = low ; i<=high ; i++){
           if(arr[i]<pivot) cnt++;
       }
       int rightPosition=low+cnt;
       swap(arr , low , rightPosition);
       
       int i=low,j=high;
       while(i<rightPosition && j>rightPosition){
           if(arr[i]>=pivot){
               if(arr[j]<pivot){
                   swap(arr , i , j);
                   i++;
                   j--;
               }
               else{
                  j--; 
               }
           }
           else{
               i++;
           }
       }
       return rightPosition;
    } 
    static void swap(int[] arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
