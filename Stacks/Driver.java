
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack(10);
		stack.push(10);
		stack.push(21);
		stack.push(5);
		stack.push(12);
		stack.push(4);
		stack.push(60);
		stack.displayTheStack();
		
		stack.pop();
		stack.displayTheStack();
		
		stack.peek();
		
		stack.push(6);
		stack.peek();
	}

}
