package Collections;

import java.util.HashMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("1", "A");
		hm.put("2", "r");
		hm.put("3", "u");
		hm.put("4", "n");
	
		
		System.out.println(hm);
		
		
		String at = hm.get("4");
		
		
		System.out.println("value of the key is : "+hm);
		System.out.println("value name is : "+at);
		

	}

}
