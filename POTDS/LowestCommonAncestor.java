
//   28 July 2023

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}

public class LowestCommonAncestor {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node tr = root;

        Node temp = new Node(2);
        root.left = temp;

        temp = new Node(4);
        root.right = temp;

        temp = new Node(5);
        tr = tr.right;
        tr.left = temp;

        temp = new Node(8);
        tr.right = temp;

        tr = root.left;
        temp = new Node(7);
        tr.left = temp;

        int n1 = 4;
        int n2 = 7;

        LowestCommonAncestor ob = new LowestCommonAncestor();

        Node ans = ob.LCA(root, n1, n2);

        System.out.println(ans.data);

    }

    Node LCA(Node root, int n1, int n2) {
        // Base case: If the root is null or one of the nodes is the root, then the root
        // itself is the LCA.
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        // If both n1 and n2 are smaller than the root's data, then the LCA lies in the
        // left subtree.
        if (n1 < root.data && n2 < root.data) {
            return LCA(root.left, n1, n2);
        }

        // If both n1 and n2 are greater than the root's data, then the LCA lies in the
        // right subtree.
        if (n1 > root.data && n2 > root.data) {
            return LCA(root.right, n1, n2);
        }

        // If n1 and n2 are on different sides of the root, then the root is the LCA.
        return root;
    }
}
