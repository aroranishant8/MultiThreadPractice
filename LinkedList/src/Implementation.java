

public class Implementation {

	public static void main(String[] args) {
		LinkedList list = new LinkedList(); 
        list.head = new Node(85); 
        list.head.next = new Node(15); 
        list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(20); 
          
        System.out.println("Given Linked list"); 
        list.printList(list.head); 
        Node reverseListhead = list.reverse(list.head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(reverseListhead); 
	}

}
