package ExceptionHandling_in_java;

public class CheckedException_ThrowsDeclaration {
	
	int x =10;
	 
	public void m1() {
		System.out.println("Value of x is :"+x);
	}
	

	public static void main(String[] args) throws Exception   {
		
		CheckedException_ThrowsDeclaration exception = new CheckedException_ThrowsDeclaration();
		exception.m1();
		
		Thread.sleep(3000);
	}

}
