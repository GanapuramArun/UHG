package Operators;

public class AssignMentOperator {

	public static void main(String[] args) {
		int a = 4;
		int var;
		var = a;
		System.out.println("var using =: "+var);
		
		var += a;
		System.out.println("var using +=: "+var);
		
		var *= a;
		System.out.println("var using *=: "+var);
		
	}

}