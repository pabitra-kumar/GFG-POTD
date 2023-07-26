import java.util.*;

class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}

public class KthAncestor {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node temp = root;

        Node tp = new Node(2);

        temp.left = tp;

        tp = new Node(3);

        temp.right = tp;

        tp = new Node(4);

        temp = temp.left;
        temp.left = tp;

        tp = new Node(5);

        temp.right = tp;

        KthAncestor ob = new KthAncestor();
        int ans = ob.kthAncestor(root , 2 , 4);

        System.out.println(ans);


    }
    public int kthAncestor(Node root, int k, int node)
    {
       
        int ans = helper(root , k , node , 0 , new ArrayList<>() , -1);
        
        return ans;
    }
    
    static int helper(Node root , int k , int node, int ind , ArrayList<Integer> arr,int ans)
    {
        
        if(ind < arr.size())
        arr.remove(ind);
        
        arr.add(ind , root.data);
        
        // System.out.println(arr);
        
        if(root.data == node && ind >= k)
        {
            ans = arr.get(ind-k);
        }
        
        
        
        if(root.left != null && ans == -1)
        {
            int temp = helper(root.left , k ,  node , ind+1 , arr, ans);
            if(temp != -1)
            return temp;
        }
        
        
        if(root.right != null && ans == -1)
        {
            int temp = helper(root.right , k ,  node , ind+1 , arr, ans);
            if(temp != -1)
            return temp;
        }
        
        return ans;
    }
}