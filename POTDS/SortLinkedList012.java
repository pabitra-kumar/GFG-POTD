
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

public class SortLinkedList012 {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = head;
        for(int i = 1 ; i <= 15 ; i++)
        {
            Node next = new Node(i % 3);
            temp.next = next;
            temp = temp.next;
        }
        
        System.out.println("Before Sorting: ");
        temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        Node ans = segregate(head);

        System.out.println("After Sorting: ");
        temp = ans;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    static Node segregate(Node head)
    {
        Node temp = head;
        int zeroes = 0;
        int ones = 0;
        // int twos = 0;
        
        while (temp != null){
            if (temp.data == 0){
                zeroes++;
            } else if (temp.data == 1){
                ones++;
            } else {
                // twos++;
            }
            temp = temp.next;
        } 
        
        temp = head;
        
        while (temp != null){
            if (zeroes > 0){
                temp.data = 0;
                zeroes--;
            } else if (ones > 0){
                temp.data = 1;
                ones--;
            } else {
                temp.data = 2;
                // twos--;
            }
            temp = temp.next;
        }
        return head;
    }
}
