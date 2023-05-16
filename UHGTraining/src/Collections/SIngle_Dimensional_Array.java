package Collections;

public class SIngle_Dimensional_Array {
	
	public static void main(String[] args) {
		
		int employeID[] = new int [4];
		
		employeID[0]= 123450;
		employeID[1]= 123456;
		employeID[2]= 123457;
		employeID[3]= 123458;
		
//		for(int i=0;i<employeID.length;i++) {
//			System.out.println(i);
//		}
		
		
		int employeID_length = employeID.length;
		System.out.println("Length of the Array is  :"+employeID_length);
		
		for(int i =0; i<employeID_length;i++) {
			System.out.println("Employe Ids are "+i);
			
			
		}
		
		
//		System.out.println("Employe ID is : "+employeID[0]);
//		System.out.println("Employe ID is : "+employeID[1]);
//		System.out.println("Employe ID is : "+employeID[2]);
//		System.out.println("Employe ID is : "+employeID[3]);
		
		
		
	}

}
