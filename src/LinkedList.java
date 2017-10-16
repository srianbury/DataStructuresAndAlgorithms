
public class LinkedList {

	public static void main(String args[]){
		//create our list
		LinkedList lList = new LinkedList();
		
		//add some items
		lList.insertAtEnd("Harry Potter", "JK Rowling");
		lList.insertAtEnd("The Giver", "Someone");
		lList.insertAtEnd("Green eggs and Ham", "Dr. Seuss");
		
		lList.print();
		
		System.out.println();
		//check for some books
		lList.isMember("Harry Potter");
		lList.isMember("Divergent");
		
		//insert at the beginning
		lList.insertAtBegin("Divergent", "V. Roth");
		
		System.out.println("\nAdding divergent...\n");
		lList.print();
		
		System.out.println();
		//check for some books
		lList.isMember("Harry Potter");
		lList.isMember("Divergent");
		
		System.out.println("\nremoving The Giver\n");
		//remove middle item
		lList.remove("The Giver");
		lList.print();
		
		//remove first item
		System.out.println("\nremoving Divergent\n");
		lList.remove("Divergent");
		lList.print();
		
		//remove the last item in list
		System.out.println("\nremoving Green eggs and Ham\n");
		lList.remove("Green eggs and Ham");
		lList.print();
		
		//Removing a book that doesnt exist
		System.out.println("\nremoving Insurgent\n");
		lList.remove("Insurgent");
		lList.print();
		
		//remove the final item just because
		System.out.println("\nremoving HP\n");
		lList.remove("Harry Potter");
		lList.print();
		
		//remove something from nothing
		System.out.println("\nremoving HP\n");
		lList.remove("Harry Potter");
		lList.print();
		
		// add to beginning of nothing
		lList.insertAtBegin("Four", "V. Roth");
		lList.print();
	}
	
	private Node head;
	private int length;
	
	//create an empty list
	public LinkedList(){
		head = null;
		length = 0;
	}
	
	//print all elements of the list
	public void print(){
		Node temp = head;
		while(temp!=null){
			System.out.println(temp.title + " written by " + temp.author);
			if(temp.next == null){
				System.out.println("Points to null");
			}else{
				System.out.println("Points to: " + temp.next.title);
			}
			temp = temp.next;
			System.out.println("--------------------------");
		}
		System.out.println("The list has " + getLength() + " items");
	}
	
	public int getLength(){
		return length;
	}
	
	//prints message if item in list
	public void isMember(String titl){
		Node temp = head;
		while(temp!=null){
			if(temp.title==titl){
				System.out.println(titl + " is in our linked list");
				return;
			}
			temp = temp.next;
		}
		System.out.println(titl + " is not in our linked list");
	}
	
	//return true or false if book is in list
	public boolean isMemberBool(String titl){
		Node temp = head;
		while(temp!=null){
			if(temp.title==titl){
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	//insert a book at the beginning
	public void insertAtBegin(String titl, String auth){
		Node first = new Node(titl, auth); //new node will be first, hence the name first
		if(isEmpty()){
			head = first;
		}else{
			first.next = head;
			head = first;
		}
		length++;
	}
	
	//insert a book at the end
	public void insertAtEnd(String titl, String auth){
		//insertAtEnds new node at the end, so we call the new node end
		
		Node currNode = head;
		Node end = new Node(titl, auth);
		if(isEmpty()){
			head = end;
		}
		else{
			while(currNode.next!=null){
				currNode = currNode.next;
			}
			currNode.next = end;
		}
		length++;
	}
	
	//remove by title
	public void remove(String titl){
		Node curr = head;
		Node prev = null;
		//check if the book is if the list
		if(!isMemberBool(titl)){
			System.out.println("Book not in list");
		}
		else if(!isEmpty()){
			while(curr.title!=titl){
				prev = curr;
				curr = curr.next;
			}
			if(curr.title==head.title){
				head = curr.next;
			}
			else if(curr.next == null){
				prev.next = null;
			}else{
				prev.next = curr.next;
			}
			length--;
		}else{
			System.out.println("Empty list");
		}
	}
	
	//check to see if the list is empty
	public boolean isEmpty(){
		return length == 0;
	}
	
	
}
