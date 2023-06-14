
// Link - https://practice.geeksforgeeks.org/problems/chinky-and-diamonds3340/1

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumDiamonds {
    public static void main(String[] args) {
        int arr[] = {20 , 50};
        System.out.println(maxDiamonds(arr, arr.length, 5));
    }
    static long maxDiamonds(int[] A, int N, int K) {
        long sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<N; i++){
            pq.add(A[i]);
        }
        
        //sorting the bags based on the diamonds being taken from the bag
        for(int i =0; i<K; i++){
            int max = pq.poll();
            sum += max;
            pq.add(max/2);
        }
        
        return sum;
    }
}