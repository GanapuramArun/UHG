package Variables;

public class StaticVariable {
	
	private static int radius;
	
	private static final double pi = 3.12;
	

	public static void main(String[] args) {
	
		radius = 3;
		System.out.println("curcumferance of a circle is "+2*pi*radius);
	}

}
