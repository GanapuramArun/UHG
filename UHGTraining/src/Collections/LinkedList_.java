package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_ {

	public static void main(String[] args) {
		
		LinkedList<String> s = new LinkedList<String>();
		
		s.add("A");
		s.add("R");
		s.add("U");
		s.add("N");
		
		LinkedList<String> s_dup = new LinkedList<String>();
		
		s_dup.addAll(s);
		System.out.println(s_dup);
		
		s_dup.removeAll(s);
		System.out.println("After removing :"+s_dup);
		
		
		System.out.println("Elements in the linked list  :"+s);
		Collections.sort(s);
		System.out.println("Elements in the linked list after sorting  :"+s);
		Collections.sort(s,Collections.reverseOrder());
		System.out.println("Elements in the linked list after sorting in reverse order :"+s);
		
		Collections.shuffle(s);
		System.out.println("Elements in the linked list after shuffling :"+s);
		
		
		

	}

}
