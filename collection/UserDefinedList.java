package collection;

import java.util.ArrayList;
import java.util.Iterator;



public class UserDefinedList {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
       ArrayList<Student> list =new ArrayList<Student>();
        
       list.add(new Student(101,"Aarti",22));
       
       list.add(new Student(102,"Riya",20));
       list.add(new Student(103,"Sayli",23));
       list.add(new Student(104,"Supriya",24));
       
       System.out.println("\n Using for each :");
       	
       for(Student student:list)
       {
    	   
    	   System.out.println(student);
       }
       System.out.println("\n Using Iterator:");
       Iterator<Student> itr = list.iterator();
     while(itr.hasNext())
    	 
     {
    	 System.out.println(itr.next());
     }
	}

}
