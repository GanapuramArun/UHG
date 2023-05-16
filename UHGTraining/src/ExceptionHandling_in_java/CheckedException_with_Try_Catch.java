package ExceptionHandling_in_java;

public class CheckedException_with_Try_Catch {
	
	int x =10;
	 
	public void m1() {
		System.out.println("Value of x is :"+x);
	}
	

	public static void main(String[] args) {
		
		CheckedException_with_Try_Catch exception = new CheckedException_with_Try_Catch();
		exception.m1();
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
