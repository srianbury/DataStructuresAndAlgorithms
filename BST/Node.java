
public class Node {
	private int key;
	private String name;
	
	private Node leftChild;
	private Node rightChild;
	
	Node(int k, String n){
		key = k;
		name = n;
	}
	
	public void setKey(int k){
		key=k;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setLeftChild(Node left){
		leftChild = left;
	}
	
	public void setRightChild(Node right){
		rightChild = right;
	}
	
	public int getKey(){
		return key;
	}
	
	public String getName(){
		return name;
	}
	
	public Node getLeftChild(){
		return leftChild;
	}
	
	public Node getRightChild(){
		return rightChild;
	}
	
	
	public String toString(){
		return name + " has a key " + key;
	}
}
