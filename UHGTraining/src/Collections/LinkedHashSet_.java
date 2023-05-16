package Collections;


import java.util.LinkedHashSet;

public class LinkedHashSet_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedHashSet<String> name = new LinkedHashSet<String>();
		
		
		name.add("z");
		name.add("y");
		name.add("x");
		name.add("w");
		
		System.out.println("elements are :"+name);
		for(String value: name) {
			System.out.println("elements are : "+value);
	}

	}
}
