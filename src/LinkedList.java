
public class LinkedList {
	Node head;
	Node tail;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	void push(int d){
		Node new_node = new Node(d);
		System.out.println("Push Opetaion");
		if (head == null) {
			head = new_node;
			tail = new_node;
			System.out.println("Head Node "+ head.data);
			System.out.println("Tail Node "+ tail.data);
		} else {
			tail.next = new_node;
			tail = new_node;
			System.out.println("Tail Node "+ tail.data);
		}
		
	}
	
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		LinkedList temp = new LinkedList();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(2);
		ll.push(1);
		
		System.out.println("Final Head Node "+ ll.head.data);
		System.out.println("Final Tail Node "+ ll.tail.data);
		
//		temp.head = ll.head;
//		while (temp.head != null){
//			System.out.println(temp.head.data);
//			temp.head = temp.head.next;
//		}
//		
//		ll.push(10);
//		
//		temp.head = ll.head;
//		while (temp.head != null){
//			System.out.println(temp.head.data);
//			temp.head = temp.head.next;
//			
//		}
		System.out.println("Palindrome method start");
		temp.head = ll.head;
		Boolean pl = temp.isPalindrome(temp.head);
		if (pl == true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

	private Boolean isPalindrome(Node head2) {
		// TODO Auto-generated method stub
		
		if (head2 == null) return true;
		
		Boolean lp1 = isPalindrome(head2.next);
		
		if (lp1 == false) return false;
		
		System.out.println(head2.data + "=="+ head.data);
		Boolean lp2 = (head2.data == head.data);
		head = head.next;
				
		if (lp2 == true)
			return true;
		else
			return false;
	}

}
