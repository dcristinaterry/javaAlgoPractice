package day2;

import java.util.LinkedList;
import java.util.Queue;

public class StackWQueue {
	   static Queue<Integer> queue = new LinkedList<Integer>();
	    
	    public void push(int value) {
//	   1 -2 -3 -4- 5 - 6   remove 1 /  add will add at the end
	    	
//	    stack adds and removes at end 
	    	
//	    	1-2-3-4-5-6      2-3-4-5-6-1   3-4-5-6-1-2   4-5-6-1-2-3  5-6-1-2-3-4  6-1-2-3-4-5     6-5-4-3-2-1
	    	
	        queue.add(value);

	        for (int i = 0; i < queue.size()-1; i++) {
	            queue.add(queue.remove());
	            
	        }
	        System.out.println(queue);
	    }

	    public  void pop() {
	        System.out.println("Element removed from stack is:" + queue.remove());
	    }
	      
	    // Driver code  
	    public static void main(String[] args) {  
	    	StackWQueue stackFromQueue = new StackWQueue();
	    	stackFromQueue.push(1);
	        stackFromQueue.push(2);
	        stackFromQueue.push(3);
	        stackFromQueue.push(4);
	 
	        System.out.println(stackFromQueue.queue);
	        stackFromQueue.pop();
	        System.out.println(stackFromQueue.queue);
	    }  

}
