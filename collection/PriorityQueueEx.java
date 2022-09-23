package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new PriorityQueue<String>();
		
		queue.add("Jasmine");
		queue.add("Lotus");
		queue.add("Rosee");
		queue.add("Mogra");
		queue.add("Rose");
		//queue.add(null);
		
	
        for(String string : queue) {
      	  System.out.println(string);
		  
      		  
	}

        System.out.println("\nhead of queue : "+queue.element());
        System.out.println("\n removing element using remove() : "+queue.remove());
        System.out.println("after removing: ");
        for(String string : queue) {
        	System.out.println(string);
        }
        System.out.println("\n removing element using poll() : "+queue.poll());
        System.out.println("after removing: ");
        for(String string : queue) {
        	System.out.println(string);
        }
        
        
        
	}

}
