package AccessModifiers;

public class Public extends B {

	public static void main(String[] args) {
		Public obj = new Public();
		int output = obj.x;
		
		System.out.println("value of x is : "+output);
		obj.b1();
		
		// TODO Auto-generated method stub

	}

}
