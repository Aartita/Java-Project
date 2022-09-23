package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();

		list.add("Aarti");
		list.add(4);
		list.add(null);
		list.add(34.6);
		list.add("Aniket");
		list.add('A');
		
		
		System.out.println("Iterating list using iterator:");
		
		Iterator itr1=list.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	//	System.out.println("Nongeneric : "+list);

		ArrayList<String> list2 =new ArrayList<String>();
		
		list2.add("Aarti");
		list2.add("Priya");
		list2.add(null);
		list2.add("Priya");
		list2.add("Aniket");
		list2.add("Supriya");
		
		System.out.println("generic : "+list2);
		System.out.println("\nIterating list using for each loop:");
		for(String str:list2)
		{
			System.out.println(str);
		}

	}

}
