import java.util.Arrays;

public class HashFunction {
	/*
	 * - theArray: String[]
	 * - arraySize: int
	 * - itemsInArray: int
	 * 
	 * +hashFunction(int size)
	 * +hashFunction1(String[] stringsForArray, String[] theArray): void
	 * +hashFunction2(String[] stringsForArray, String[] theArray): void
	 * +findKey(String key): String
	 * +displayTheArray(): void
	 * 
	 * 
	 */
	
	String[] theArray; //an array of strings
	int arraySize; //size of the array to be created
	int itemsInArray = 0; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//introduction to hashtables and hash functions
		/*
		 * What is a Hash Table?
		 * 
		 * A Hash Table is a data structure
		 * 
		 * offers fast insertion and searching
		 * 
		 * they are limited in size because they are based on arrays
		 * 
		 * can be resized, but it should be avoided
		 * 
		 * they are hard to order
		 * 
		 * 
		 * Key values are assigned to elements in a Hash Table using a Has
		 * Function
		 * 
		 * A Hash Function helps calculate the best index an item should go it
		 * 
		 * Index must be small enough for the arrays size
		 * 
		 * don't overwrite other data in the hashtable
		 * 
		 * with Hash Tables the array does not need to be searched
		 * 
		 * we use the calculation instead
		 * 
		 */
		
		HashFunction theFunc = new HashFunction(30); //create an instance of HashFunction
		HashFunction theOtherFunc = new HashFunction(30);
		
		String[] elementsToAdd = {"1", "5", "17", "21", "26"}; //array of elements to add to the hash function
		String[] moreElementsToAdd = {"7", "10", "500", "170", "201", "2600"}; 
		
		theFunc.hashFunction1(elementsToAdd, theFunc.theArray); 
		theFunc.hashFunction2(moreElementsToAdd, theOtherFunc.theArray);
		
		theFunc.displayTheArray();
		theOtherFunc.displayTheArray();
		
		theOtherFunc.findKey("170");
	}
	
	//basically does no math
	//just maps the input to its corresponding value
	public void hashFunction1(String[] stringsForArray, String[] theArray){
		for(int i=0; i<stringsForArray.length; i++){
			String newElementVal = stringsForArray[i]; //put the nth element in the passed in string into the variable newElementVal
			
			theArray[Integer.parseInt(newElementVal)] = newElementVal; //put the new element in its corresponding spot in theArray
		}
	}
	
	public void hashFunction2(String[] stringsForArray, String[] theArray){
		for(int i=0; i<stringsForArray.length; i++){
			String newElementVal = stringsForArray[i];
			
			int arrayIndex = Integer.parseInt(newElementVal) % theArray.length;
			
			System.out.println("Mod Index= " + arrayIndex + " for value " + newElementVal);
			
			//if the value is not -1 we have hit a collision
			while(theArray[arrayIndex]!="-1"){
				arrayIndex++;
				
				System.out.println("Collision.  Trying " + arrayIndex);
				
				//calculate new arrayIndex
				arrayIndex %= arraySize;
			}
			
			theArray[arrayIndex] = newElementVal;
		}
	}
	
	public String findKey(String key){
		int arrayIndexHash = Integer.parseInt(key) % theArray.length;
		while(theArray[arrayIndexHash]!="-1"){
			if(theArray[arrayIndexHash]==key){
				System.out.println(key + " was found in Index " + arrayIndexHash);
				return theArray[arrayIndexHash];
			}
			arrayIndexHash++;
			
			arrayIndexHash %= arraySize;
		}
		
		return null;
	}
	
	HashFunction(int size){
		arraySize = size;
		theArray = new String[size];
		Arrays.fill(theArray, "-1");
	}
	
	public void displayTheArray(){
		System.out.println("Index\tValue");
		for(int i=0; i<arraySize; i++){
			if(Integer.parseInt(theArray[i])>0){
				System.out.println(i + "\t" + theArray[i]);
			}else{
				System.out.println(i + "\t");
			}
			
		}
	}

}
