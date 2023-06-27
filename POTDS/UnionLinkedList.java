import java.util.SortedSet;
import java.util.TreeSet;


public class UnionLinkedList {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
    public Node findUnion(Node head1,Node head2)
	{
	    Node res = new Node(0);
	    Node temp = res;
	    SortedSet<Integer> set = new TreeSet<Integer>();
	    while(head1 != null || head2 != null)
	    {
	        if(head1 != null)
	        {
	            set.add(head1.data);
	            head1 = head1.next;
	        }
	        
	        if(head2 != null)
	        {
	            set.add(head2.data);
	            head2 = head2.next;
	        }
	    }
	   int k = 0;
	    for(int i : set)
	    {
	        temp.data = i;
	        if(k != set.size()-1)
	        {
	            temp.next = new Node(0);
	            temp = temp.next;
	            k++;
	        }
	        
	    }
	    
	    return res;
	}
}
