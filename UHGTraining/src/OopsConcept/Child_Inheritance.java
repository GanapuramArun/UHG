package OopsConcept;

public class Child_Inheritance extends Parent_Inheritanve {

	public void mul() {
		System.out.println("multiplication from Child_class");
	}

	public void div() {
		System.out.println("division from Child_class");

	}

	public static void main(String[] args) {
		Child_Inheritance C1 = new Child_Inheritance();
		C1.div();
		C1.mul();
		C1.add();
		C1.sub();
		System.out.println("*************************************");

		Parent_Inheritanve P1 = new Parent_Inheritanve();

		P1.add();
		P1.sub();

		System.out.println("***************************************");
		
		
		
        int x = 2; 
        int y = 0; 
        for ( ; y < 10; ++y)  
        { 
            if (y % x == 0)  
                continue;   
            else if (y == 8) 
                 break; 
            else 
               System.out.print(y + " "); 
        } 



	}
}


