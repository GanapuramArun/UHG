package Operators;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int x = 10;
		int y = 20;
		
		
		int results = +x;
		
		System.out.println("+x = "+ results);
		
		results = -y;
		System.out.println("-y = "+ results);
		
		
		results = ++x;
		System.out.println("++x = "+ results);
		
		
		results = --y;
		System.out.println("--y = "+ results);
		
		boolean ok =false;
		System.out.println(ok);
		System.out.println(!ok);
		
		
	}

}
