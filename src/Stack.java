
public class Stack {
	
	class Node{
		int data;
		Node(int data){
			this.data = data;
		}
	}
	
	Node current;
	
	void push(int data){
		Node new_node = new Node(data);
		current = new_node;
		System.out.println("Node pushed  "+ current.data);
	}
	
	
	public static void main(String[] args){
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		//st.pop();
		
	}

}
