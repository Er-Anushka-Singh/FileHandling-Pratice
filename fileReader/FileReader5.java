package FileHandling.fileHandling.filehandling;
import java.io.*;

public class FileReader5 {

	public static void main(String[] args) {
		String filePath = "E://user1.txt";
		File f1 = new File(filePath);
		try(FileInputStream fis = new FileInputStream(f1);
				BufferedInputStream bis = new BufferedInputStream(fis);){
			  int x = bis.read();
			  while(x!= -1) {
				 System.out.print((char)x); 
				 x = bis.read();
			  }
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
