import java.util.HashMap;

class Node{
	int key;
	String value;
	Node next;
	Node prev;
	public Node (int key,String value){
		this.key= key;
		this.value=value;
	}
}
public class LRUCache {
	int capacity;
	Node head = null;
	Node end = null;
	HashMap<Integer, Node> map = new HashMap<Integer , Node>();
	
	public LRUCache(int capacity){
		this.capacity = capacity;
	}

	public String get(int key){
		if (map.containsKey(key)){
			Node n = map.get(key) ;
			remove (n);
			setHead(n);
			return n.value;
		}
		return null;
	}
	
	public void remove(Node n){
		if (n.prev != null)
			n.prev.next = n.next;
		else
			head = n.next;
		
		if (n.next != null)
			n.next.prev = n.prev;
		else
			end = n.prev;

	}

	public void setHead(Node n){
		n.next = head;
		n.prev = null;
		
		if (head != null)
			head.prev = n;
		head = n;
		
		if (end == null)
			end = head;
	}

	public void set(int key, String value){
		if (map.containsKey(key)){
			Node n = map.get(key);
			n.value=value;
			remove(n);
			setHead(n);
		}
		else {
			Node newNode = new Node (key,value);
			if (map.size() >= capacity){
				map.remove(end.key);
				remove (end);
				setHead (newNode);
				
			} else{
			setHead(newNode);
			}
			map.put(key, newNode);
			
		}
	}
	
	public void printCache(){
		Node temp = new Node(0,null);
		temp = head;
		System.out.print("Cache Element : ");
		while (temp != null){
			System.out.print(temp.value+ " ");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	public static void main(String[] args)

	{

	LRUCache lr=new LRUCache(5);
	lr.set(1, "1");
	lr.set(2,"2");
	lr.set(3, "3");
	lr.set(4, "4");
	lr.set(5, "5");
	lr.printCache();
	String val=lr.get(1);
	System.out.println("Get 1 ");
	lr.printCache();
	lr.set(6, "6");
	System.out.println("Insert 6 ");
	lr.printCache();
	String val2=lr.get(2);
	System.out.println("get 2 ");
	lr.printCache();

	}
	
	
}
