
public class ReverseListInGroup {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node temp = node;
        for (int i = 2; i <= 5; i++) {
            Node next = new Node(i);
            temp.next = next;
            temp = temp.next;
        }
        int k = 3;
        Node ans = reverse(node, k);
        temp = ans;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node reverse(Node node, int k) {
        if (node == null)
            return null;
        Node prev = null;
        Node temp = node;
        Node pointer = node;
        int i = 0;
        while (i < k && pointer != null) {
            pointer = pointer.next;
            temp.next = prev;
            prev = temp;
            temp = pointer;
            i++;
        }

        node.next = reverse(temp, k);

        return prev;
    }
}

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}
