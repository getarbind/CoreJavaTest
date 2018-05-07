public class BSTFindNode {

	class Node{
		Node left, right;
		int key;
	
		Node(int item){
			key = item;
			left = right = null;
		}
	}
	
	Node root;
	
	void insert(int item){
		root = insertRec(root, item);
	}
	
	private Node insertRec(Node root, int key) {
	
		if (root == null){
			root = new Node(key);
			return root;
		}
		
		if ( key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);
		
		return root;
	}
	
	private void inorder() {
		inorderRec(root);
		
	}
	
	void inorderRec(Node root){
		if (root != null){
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
		
	}

	public static void main(String[] args ){
	BSTFindNode tree = new BSTFindNode();
	tree.insert(50);
	tree.insert(60);
	tree.insert(70);
	tree.insert(80);
	tree.insert(10);
	tree.insert(20);
	tree.insert(30);	
	tree.insert(40);
	System.out.println("Insert Complete");
	
	tree.inorder();
	
	tree.search(21);
	
	}
	

	private void search(int i) {
		Node n = searchRec(root, i);
		if (n== null)
			System.out.println("Key Not Found!!!" );
		else
		System.out.println("Key Found : " + n.key);		
	}

	private Node searchRec(Node root, int key) {
		if (root == null || root.key == key)
			return root;
		
		if (key < root.key)
			return searchRec (root.left, key);
		
		return searchRec (root.right, key);
		
	}


	

}
