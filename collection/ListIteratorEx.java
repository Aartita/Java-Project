package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		ArrayList<String> list = new ArrayList<String>();
		list.add("Raj");
		list.add("Priya");
		list.add("Reema");
		list.add("Ravi");
		list.add("Ravi");
		
		
		ListIterator<String> itr = list.listIterator();
		System.out.println("Iterating in forward direction");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\n Iterating in backward direction:");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		



	}
}


