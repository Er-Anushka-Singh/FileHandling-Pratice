package FileHandling.fileHandling;
import java.io.*;
public class FileCreate {
      public static void main(String[] args) {
		String filePath = "E:\\user.txt";
		File f1 = new File(filePath);
		try {
			f1.createNewFile();
			System.out.println("File is create !");
		}catch(Exception e) {
			System.out.println("File is not Create !");
			System.out.println(e.getMessage());
			
		}
		System.out.println("<=========Program End =========>");

	}

}

