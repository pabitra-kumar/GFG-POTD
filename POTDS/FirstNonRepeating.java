import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String A = "blybjrzbbyivawvdesebvusjnijimtzkuzdtfkpkpuyjynzxmapwzvrxpluuzbftozbqedqwtlvvnexfvualb";
        String ans = firstNonRepeating(A);
        System.out.println(ans);
    }
    public static String firstNonRepeating(String A)
    {
    //    int n = A.length();
       Queue<Character> q = new LinkedList<>();
       int[] map = new int[128];
       StringBuilder ans =new StringBuilder();
       
       for(char c : A.toCharArray()){ 
           map[c]++;
           
           if(map[c]==1) q.add(c);
           
           while(!q.isEmpty() && map[q.peek()]>1) q.remove();
           ans.append(q.isEmpty() ? '#' : q.peek());
       }
       return ans.toString();
    }
}
