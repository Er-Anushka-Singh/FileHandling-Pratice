package FileHandling.fileHandling.filehandling;
import java.io.*;

public class FileReader3 {


	public static void main(String[] args) {
		 String filePath = "E:\\user1.txt";
		 File f1 = new File(filePath);
		 
		 try(FileReader fr = new FileReader(f1);
				 BufferedReader br = new BufferedReader(fr)){
			 
			 // It will read only one line
			//   System.out.println(br.read());
			 
			 String s = br.readLine();
			 while(s!=null) {
				 System.out.println(s);
				 s=br.readLine();
			 }
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }

	}

}
