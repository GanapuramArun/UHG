package FilesinJava;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {

	public static void main(String[] args) throws IOException {
		try {
			FileWriter file = new FileWriter("C:\\Users.txt");
			file.write("this text will be write in your file");
			file.close();
			System.out.println("text has been writen in file successfully");
			
			
		}
		catch(FileNotFoundException e ) {
			System.out.println("an error occure");
			e.printStackTrace();
		}
		

	}

}
