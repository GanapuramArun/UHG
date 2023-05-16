package Collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<String> name = new TreeSet<String>();
			
			
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