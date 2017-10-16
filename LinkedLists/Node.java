
public class Node {
	/*
	 * +next: Node
	 * -
	 * 
	 */
	public String title;
	public String author;
	
	public Node next;
	
	public Node(String titl, String auth){
		title = titl;
		author = auth;
	}
	
	public String toString(){
		return title;
	}
}
