package FilesinJava;

import java.io.File;

public class GetFileInfo {

	public static void main(String[] args) {
		
		
	
			
			File file = new File("C:.text");
			if(file.exists()) {
				System.out.println("File name: "+file.getName());
				System.out.println("File absolute path is : "+file.getAbsolutePath());
				System.out.println("File can be writeable : "+file.canWrite());
				System.out.println("File can be reab : "+file.canRead());
				System.out.println("File size in bytes  : "+file.length());
				
				
				
				
			}else {
				System.out.println("File dpes not  exists");
				
			}

	}

}
