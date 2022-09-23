package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplClassesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Set<String> hSet = new HashSet<String>();
          hSet.add("Apple");
          hSet.add("Mango");
          hSet.add("Banana");
          hSet.add("Guava");
          hSet.add("Apple");
          hSet.add(null);
          
          System.out.println("Implementing HashSet : ");
          for(String string : hSet) {
        	  System.out.println(string);
          }

          
          LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
          
          linkedHashSet.add("Pizza");
          linkedHashSet.add("Coffee");
          linkedHashSet.add("Biryani");
		  
          linkedHashSet.add("Burger");
          linkedHashSet.add("Coffee");
          linkedHashSet.add(null);
          
          System.out.println("\nImplementing LinkedHashSet : ");
          for(String string : linkedHashSet) {
        	  System.out.println(string);
		  
        		  
	}
          
          
          TreeSet<String> treeSet = new TreeSet<String>();
          
          treeSet.add("Lotus");
          treeSet.add("Rose");
          
          treeSet.add("Jasmine");
          
          treeSet.add("Lilly");
          
          treeSet.add("Lotus");
         // treeSet.add(null);        can't store null ,otherwise you will get NullPointerException 
          
          
          System.out.println("\nImplementing TreehSet : ");
          for(String string : treeSet) {
        	  System.out.println(string);
          
          
          
}
          
	}
}
