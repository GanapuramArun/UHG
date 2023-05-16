package ExceptionHandling_in_java;

public class UncheckedException_TryCatchFinally {

	public static void main(String[] args) {

		
		try {
			int a = 10/0;
			System.out.println("Devision Result is "+a);
			
		}catch(ArithmeticException e) {
			System.out.println("something went wromg please check "+ e.getMessage());
		}
		finally {
			System.out.println("finally excuted");
			
		}
		
		
		
		
//		*****************************************************************************************
		
		try {
		
		
		int[] mynum = {1,2,3,4};
		
		System.out.println(mynum[10]);
		}
		catch(Exception e) {
			System.out.println("something went wrong");
			
		}
		
		finally {
			System.out.println("try catch excuted");
		}
	}

}
