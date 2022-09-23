package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<String, String>();
        map.put("Br", "Brazil");
        map.put("In", "India");
        
        map.put("De", "Germany");
        
        System.out.println("Implementing HashMap: ");
        for(Map.Entry<String, String> entry : map.entrySet())
        {
        	System.out.println("Country code: "+entry.getKey()+"Country Name : "+entry.getValue());
        }
        
        System.out.println("\n"+map.get("In"));
        
        
        TreeMap<String , String> treeMap = new TreeMap<String,String>();
        treeMap.put("B10", "Sandwitch");
        treeMap.put("D50", "PavBhaji");
        treeMap.put("L15", "Chole-Puri");
        treeMap.put("B20", "Coffee");
        
        
        System.out.println("Implementing TreeMap: ");
        for(Map.Entry<String, String> entry : treeMap.entrySet())
        {
        	System.out.println("Menu code: "+entry.getKey()+"Menu Name : "+entry.getValue());
        }
        
        
        
        
        Hashtable<String,String>
        
        
        
        
        
	}

}
