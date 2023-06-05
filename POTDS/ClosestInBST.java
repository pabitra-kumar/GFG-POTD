public class ClosestInBST {
    class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = right = null;
        }
    }
    static int minDiff(Node  root, int K) 
    { 
        int min = Integer.MAX_VALUE;
        min = find(root , K , min);
        return min;
        
    }

    public static int find(Node node , int K , int min)
    {
        min = Math.min(min , Math.abs(node.data - K)) ;
        if(node.left != null) min = find(node.left , K , min);
        if(node.right != null) min = find(node.right , K , min);

        return min ;
    }
}
