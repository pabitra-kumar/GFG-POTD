import java.util.ArrayList;

class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}

public class RightViewOfBinaryTree {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node right = new Node(2);
        Node left = new Node(3);
        node.right = right;
        node.left = left;
        RightViewOfBinaryTree ob = new RightViewOfBinaryTree();
        ArrayList<Integer> ans = ob.rightView(node);
        System.out.println(ans);
    }
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(node , 0 , ans);
        return ans;
    }
    static void helper(Node head, int ind , ArrayList<Integer> ans)
    {
        if(ind < ans.size())
        ans.remove(ind);
        ans.add(ind , head.data);
        
        if(head.left != null)
        helper(head.left , ind+1 , ans);
        
        if(head.right != null)
        {
            helper(head.right , ind+1 , ans);
        }
    }
}
