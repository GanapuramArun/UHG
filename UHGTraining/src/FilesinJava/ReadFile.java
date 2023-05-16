package FilesinJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
	
		try {
			File file = new File("C:\\Users.txt");
			Scanner scan = new Scanner(file);
			
			while(scan.hasNextLine()) {
				String data = scan.nextLine();
				System.out.println(data);
			}
			
			scan.close();
			
		}
		catch(FileNotFoundException e ) {
			System.out.println("an error occure");
			e.printStackTrace();
		}
		
		

	}

}
