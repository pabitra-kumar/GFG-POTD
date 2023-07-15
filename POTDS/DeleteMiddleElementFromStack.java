import java.util.* ;

public class DeleteMiddleElementFromStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for(int i = 1 ; i <= 5 ; i++)
        {
            s.push(i*10);
        }
        System.out.println(s);
        deleteMid(s, s.size());
        System.out.println("After deleting mid: " + s);
    }
    public static void deleteMid(Stack<Integer>s,int sizeOfStack){
        int t = (sizeOfStack+1)/2;
        s.remove(t-1);
    }
}
