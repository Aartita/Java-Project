package collection;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Raj");
		list.add("Priya");
		list.add("Reema");
		list.add("Ravi");
		list.add("Ravi");
		list.add(null);

		
		System.out.println("Iterating elements using Iterator : ");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\n Iterating elements using for-each : ");
		for (String string :list)
		{
			System.out.println(string);
		}
	}

}
