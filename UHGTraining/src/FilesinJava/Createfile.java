package FilesinJava;

import java.io.File;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) {
		try {
			
		File file = new File("C:.text");
		if(file.createNewFile()) {
			System.out.println("File Created: "+file);
			System.out.println("File Created: "+file.getAbsolutePath());
		}else {
			System.out.println("File already exists");
			
		}
		}catch(IOException e) {
			System.out.println("An Erorr occured");
			e.printStackTrace();
		}

}
}