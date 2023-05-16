package Collections;

import java.util.HashSet;


public class HashSet01 {

	public static void main(String[] args) {
		
		
		HashSet<String> name = new HashSet<String>();
		
		
		name.add("cat");
		name.add("dog");
		name.add("fox");
		name.add("rat");
		
		System.out.println("elements are :"+name);
		for(String value: name) {
			System.out.println("elements are : "+value);
			
		}
			
		
	}

}
