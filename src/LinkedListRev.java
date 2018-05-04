
public class LinkedListRev {
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
		
	Node head;
	Node tail;
	
	void push(int data){
		Node new_node = new Node(data);
		if (head == null){
			head = new_node;
			tail = new_node;
		}
		else{
			tail.next = new_node;
			tail = new_node;
		}
		
				
	}
		
	public static void main (String[] args){
		LinkedListRev llr = new LinkedListRev();
		llr.push(1);
		llr.push(2);
		llr.push(3);
		llr.push(4);
		llr.push(5);
		llr.push(6);
		
		llr.revLinkedList();
		
		
			
	}

	private void revLinkedList() {
		// TODO Auto-generated method stub
		Node temp = head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}

		Node prev = null;
		Node current = head;
		Node next = null;
		System.out.println("=========");
		
		
		while (current != null){			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			//System.out.println("New Head "+ head.data);			
		}
		
		while(prev!= null){
			System.out.println(prev.data);
			prev = prev.next;
		}
			
	}
		
	

}
