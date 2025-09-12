package FileHandling.fileHandling.filehandling;
import java.io.*;
import java.util.Iterator;


public class FileReader4 {

	public static void main(String[] args) {
		 String filePath = "E:\\user1.txt";
		 File f1 = new File(filePath);
		 try(FileInputStream fis = new FileInputStream(f1)){
			  byte [] x = fis.readNBytes(100);
			  for(byte p:x) {
				  System.out.print((char)p);
			  }
			  
			//System.out.println(fis.readAllBytes()); 
			 
			 
			 
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }

	}

}
