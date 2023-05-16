package Variables;

public class LocalVariable {
	
	public void cal(){
		
		int height = 0;
		height = height + 170;
		System.out.println("Height is "+height+" cm");
		
	}

	public static void main(String[] args) {
	
		LocalVariable l = new LocalVariable();
		l.cal();
	}

}
