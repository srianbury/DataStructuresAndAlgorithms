import java.util.Arrays;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Queue {
	private int[]  queue;
	private int queueSize;
	private int front, rear, numberOfItemInQueue = 0;
	
	Queue(int size){
		queueSize = size;
		queue = new int[size];
		Arrays.fill(queue, -1);
	}
	
	//normal addition to queue
	public void addToEndOfQueue(int value){
		if(numberOfItemInQueue+1<queueSize){
			queue[rear] = value;
			rear++;
			numberOfItemInQueue++;
		}else{
			System.out.println("The Queue is full.");
		}
	}
	
	public void removeFromFront(){
		if(numberOfItemInQueue>0){
			System.out.println("Removed " + queue[front]);
			queue[front]=-1;
			front++;
			numberOfItemInQueue--;
		}else{
			System.out.println("Nothing to remove, the queue is empty");
		}
	}
	
	public void peek(){
		System.out.println("Value at the front of the queue is " + queue[front]);
	}
	
	public void displayTheQueue(){
		for(int value : queue){
			if(value!=-1){
				System.out.println(value);
			}
		}
	}
}
