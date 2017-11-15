
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sorry for the lack of clean code
		BST bst = new BST();
		bst.addNode(10, "Brian");
		bst.addNode(5, "Peter");
		bst.addNode(0, "Joe");
		bst.addNode(15, "Jake");
		bst.addNode(2, "Matt");
		bst.addNode(12, "Zach");
		bst.addNode(13, "Alaska");
		
		System.out.println("Printing tree in order");
		bst.inOrderTraversal(bst.root);
		
		System.out.println("\nPrinting tree in preorder");
		bst.preOrderTraversal(bst.root);
		
		System.out.println("\nPrinting tree in postorder");
		bst.postOrderTraversal(bst.root);
		
		System.out.println("\nLooking for Alaska");
		System.out.println(bst.findNode(13));
	}

}
