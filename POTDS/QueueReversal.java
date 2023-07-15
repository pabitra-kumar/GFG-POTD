import java.util.LinkedList;
import java.util.Queue;

public class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1 ; i < 30 ; i = i+3)
        {
            q.add(i);
        }
        System.out.println(rev(q));
    }
    public static Queue<Integer> rev(Queue<Integer> q){
        
        if(q.isEmpty()) 
        return q;
        
        int temp=q.poll();
        
        rev(q);
        
        q.offer(temp);
        
        return q;
    }
}
