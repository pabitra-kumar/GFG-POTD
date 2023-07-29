
//   29 July 2023

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}

public class MedianOfBST {
    public static void main(String[] args) {

    }

    public static float findMedian(Node root) {
        int count = findCount(root);

        a = 0;
        b = 0;
        i = 0;

        findMedianHelper(root, count);

        return (count % 2 == 0) ? (a + b) / 2 : b;

    }

    static float a, b;
    static int i;

    public static int findCount(Node root) {

        if (root == null)
            return 0;

        return findCount(root.left) + findCount(root.right) + 1;
    }

    public static void findMedianHelper(Node root, int count) {

        if (root == null)
            return;

        findMedianHelper(root.left, count);

        i++;

        if (i == count / 2)
            a = root.data;

        if (i == count / 2 + 1) {
            b = root.data;
            return;
        }

        findMedianHelper(root.right, count);
    }
}
