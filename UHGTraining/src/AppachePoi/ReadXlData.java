package AppachePoi;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadXlData {

	public static void main(String[] args) throws Exception {
		try {
			File file = new File("C:\\Users\\user\\eclipse-workspace\\Xl file Reader.txt");
		
		Scanner myReader = new Scanner(file);
		
	
		while (myReader.hasNextLine())
		{
			String data = myReader.nextLine();
			System.out.println(data);
		}
		
		   myReader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("An erorr occured");
			e.printStackTrace();
		}
	}

}
