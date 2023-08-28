package August;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        Node head = new Node(1);

        int[] arr = { 1, 3, 3, 3, 9, 9, 34, 45, 45 };

        Node temp = head;

        for (int i = 0; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        printNode ob2 = new printNode();
        ob2.print(head);

        RemoveDuplicateFromList ob = new RemoveDuplicateFromList();
        Node res = ob.removeDuplicates(head);

        ob2.print(res);

    }

    Node removeDuplicates(Node head) {
        if (head.next == null || head == null)
            return head;

        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data == temp.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}
