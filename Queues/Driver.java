
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue(10);
		queue.addToEndOfQueue(10);
		queue.addToEndOfQueue(12);
		queue.addToEndOfQueue(9);
		queue.addToEndOfQueue(6);
		queue.addToEndOfQueue(21);
		queue.displayTheQueue();
		
		queue.removeFromFront();
		queue.displayTheQueue();
		
		queue.peek();
		queue.displayTheQueue();
	}

}
