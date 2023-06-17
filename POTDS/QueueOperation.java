import java.util.LinkedList;
import java.util.Queue;

public class QueueOperation {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5 , 2 , 3 , 1};
        int[] arr2 = {1 , 3 , 2 , 9 , 10};
        Queue<Integer> q = new LinkedList<>();
        for(int i : arr)
        insert(q, i);

        for(int i : arr2)
        System.out.println(findFrequency(q, i));
    }

    // Function to insert element into the queue
    static void insert(Queue<Integer> q, int k){
        
        q.add(k);
        
    }
    
    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k){
        if(q.contains(k))
        {
            int[] arr = new int[q.size()];
            int res = 0 ;
            for(int i = 0 ; i<arr.length ; i++)
            {
                arr[i] = q.poll();
                if(arr[i] == k) res++;
            }
            for(int i : arr)
            {
                q.add(i);
            }
            return res;
        }
        else
        {
            return -1;
        }
    }
}