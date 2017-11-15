
public class BST {
	Node root = null;
	public void addNode(int key, String name){
		Node newNode = new Node(key, name);
		
		if(root==null){ root = newNode; }
		else {
			Node curNode = root;
			Node parent;  //future parent for newNode
			
			while(true){
				parent = curNode;
				// if the newNode less than the current node, then it should go to the left
				if(key<curNode.getKey()){
					curNode = curNode.getLeftChild();
					if(curNode == null){
						//if the current node is empty set it to the newNode 
						parent.setLeftChild(newNode);
						return;
					}
				}else{
					//need to put the node on the right
					curNode = curNode.getRightChild();
					if(curNode == null){
						parent.setRightChild(newNode);
						return;
					}
				}
			}
		}
	}
	
	public Node findNode(int key){
		Node curNode = root;
		while(curNode.getKey()!=key){
			if(key < curNode.getKey()){
				curNode = curNode.getLeftChild();
			}else{
				curNode = curNode.getRightChild();
			}
			
			if(curNode==null){ return null; }
		}
		return curNode;
	}
	
	public void inOrderTraversal(Node curNode){
		if(curNode != null){
			inOrderTraversal(curNode.getLeftChild());
			System.out.println(curNode);
			inOrderTraversal(curNode.getRightChild());
		}
	}
	
	public void preOrderTraversal(Node curNode){
		if(curNode != null){
			System.out.println(curNode);
			preOrderTraversal(curNode.getLeftChild());
			preOrderTraversal(curNode.getRightChild());
		}
	}
	
	public void postOrderTraversal(Node curNode){
		if(curNode != null){
			postOrderTraversal(curNode.getLeftChild());
			postOrderTraversal(curNode.getRightChild());
			System.out.println(curNode);
		}
	}
}
