public class LinkedList {

	public static Node head;


	
	Node reverse(Node head) { 
		
		Node prev=null;
		Node current=head;
		head.next=null;
		head=temp;
		
		while(head.next!=null)
		{
			prev=head;
			temp=head.next;
			head.next=prev;
			head=temp;
		}
 
        return head; 
    } 
	
	  // prints content of double linked list 
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
	
	
	
}