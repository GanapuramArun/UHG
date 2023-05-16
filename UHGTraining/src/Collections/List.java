package Collections;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
	
		
		ArrayList<String> obj1 = new ArrayList<String>();
		
		obj1.add("Selenium");
		obj1.add("QTP");
		obj1.add("Postman");
		obj1.add("Jmeter");
		obj1.add("Appium");
		
		
		String output = obj1.get(3);
		System.out.println("The Output is "+output);
		System.out.println("elements are "+obj1);
		

	}

}
