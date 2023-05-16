package ConditionStatements;

public class NestedIfStatement {

	public static void main(String[] args) {
		
		String state = "Telangana, Mumbai";
		
		if (state.endsWith("Mumbai")) {
			if(state.contains("Ap")) {
				System.out.println("Your State is  Ap");
			}
			System.out.println("Your State is ");
		}
		else if (state.startsWith("Telangana")) {
			System.out.println("your state is Telanaga");
		}else {
			System.out.println(state.split(",")[1]);
		}
		
		 
		//System.out.println("your state is not Telangana");
		
		
		
	}
}


