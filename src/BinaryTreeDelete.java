
public class BinaryTreeDelete {
	
	class Node{
		int key;
		Node left, right;
		
		Node(int key){
			this.key = key;
			this.left  = null;
			this.right = null;
		}
	}
	
	Node root;
	
	public static void main(String [] args){
		BinaryTreeDelete tree = new BinaryTreeDelete();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(60);
		System.out.println("Insert Complete");
		System.out.println("Inorder Traversal");
		tree.inOrder();
		
		System.out.println("Delete Tree");
		tree.delete();
		
		System.out.println("Inorder Traversal");
		tree.inOrder();
		
	}
	
	private void delete() {
		deleteRec(root);
		root = null;
	}

	private void deleteRec(Node root2) {
		if (root2 != null){
			deleteRec(root2.left);
			deleteRec(root2.right);
			
			System.out.println("Deleting Node"+ root2.key);
			//root2 = null;
			root2.left=null;
			root2.right=null;
		}

	}

	private void inOrder() {
		inorderRec(root);
		
	}

	private void inorderRec(Node root2) {
		if (root2 != null){
			inorderRec(root2.left);
			System.out.println(root2.key);
			inorderRec(root2.right);
		}
		
	}

	private void insert(int key) {
		root = insertRec(root, key);
		
	}

	private Node insertRec(Node root, int key) {
		if (root == null){
			root = new Node(key);
			return root;
		}
		
		if (key < root.key){
			root.left = insertRec (root.left, key);
		}
		
		if (key > root.key){
			root.right = insertRec (root.right, key);
		}
		
		return root;
		
	}

}
