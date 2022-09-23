package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Raj");
		list.add("Priya");
		list.add("Reema");
		list.add("aaru");
		list.add("Ravi");
        list.add("Meera");
        
        Collections.sort(list);
        
        System.out.println("Sorting string objects :");
        
        for(String string : list) {
        	System.out.println(string);
        }
        
        
        
        ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(55);
		list2.add(3);
		list2.add(45);
		list2.add(35);
		list2.add(18);
		
		
		
	
	
	 Collections.sort(list2);
     
     System.out.println("Sorting wrapper objects :");
     
     for(Integer integer : list2) {
     	System.out.println(integer);
     }
     

}
	
}
	
