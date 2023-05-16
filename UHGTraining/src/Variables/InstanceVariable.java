package Variables;

public class InstanceVariable {
	
	
	public int rollnum;
	public String Name;
	public int totalMarks;
	public int number;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable iv = new InstanceVariable();
		iv.rollnum = 10190;
		iv.Name = "Arun";
		iv.totalMarks = 499;
		iv.number = 987654321;
		
		System.out.println(iv.Name);
		System.out.println(iv.rollnum);
		System.out.println(iv.totalMarks);
		System.out.println(iv.number);

	}

}
