package ConditionStatements;

public class If_elseifStatement {

	public static void main(String[] args) {
		
		String  City = "Kamareddy";
		
		if(City == "Kamareddy") {
			System.out.println("your city is : "+City);
			
		} else if(City == " Nizamabad") {
			
			System.out.println("your not belongs to this city "+City);
			
		}else if(City == "Hyderabad") {
			
			System.out.println("your not belongs to this city "+City);
			
		}else {
			
			System.err.println(" Hello check your city in the mentioned String. Thank you!");
		
		}

	}

}
