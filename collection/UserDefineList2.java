package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefineList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(101,"Aarti",26));
		list.add(new Employee(102,"Minal",36));
		list.add(new Employee(103,"Riya",28));
		list.add(new Employee(104,"Shivani",29));
		list.add(new Employee(105,"Suprriya",30));
		
		System.out.println("\n Using Iterator:");
		Iterator<Employee> itr =list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
