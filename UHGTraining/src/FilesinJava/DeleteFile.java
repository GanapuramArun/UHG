package FilesinJava;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
			
			File file = new File("C:.text");
			if(file.delete()) {
				System.out.println("File delete: "+file);
				System.out.println("File delete: "+file.getName());
			}
			else {
				System.out.println("Failed delete file");

		

		}
		
	}
		
	}
