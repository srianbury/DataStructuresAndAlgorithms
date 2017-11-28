import java.util.Arrays;

public class Stack {
	private int[] stack;
	private int stackSize; //size of the stack array
	private int topOfStack = -1; //index of the top of the stack
	Stack(int size){
		stackSize = size;
		stack = new int[size];
		Arrays.fill(stack, -1);
	}
	
	public void push(int input){
		if(topOfStack + 1 < stackSize){
			topOfStack++;
			stack[topOfStack] = input;
		}else{
			System.out.println("The stack is full.");
		}
	}
	
	public void pop(){
		if(topOfStack>=0){
			System.out.println(stack[topOfStack] + " was removed.");
			stack[topOfStack] = -1; //for display purposes only because output skips -1
			topOfStack--;
		}else{
			System.out.println("The stack is empty.");
		}
	}
	
	public void peek(){
		System.out.println(stack[topOfStack] + " is at the top of the stack.");
	}
	
	public void displayTheStack(){
		System.out.println("The stack:");
		for(int i=stackSize-1; i>-1; i--){
			if(stack[i]!=-1){
				System.out.println(stack[i]);
			}
		}
	}
}
