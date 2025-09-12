package FileHandling.fileHandling.filehandling;
import java.io.*;
public class FileReader2 {
	public static void main(String[] args) {
	    String FilePath = "E://user.txt";
	    File f1 = new File(FilePath);
	    try( FileReader fr = new FileReader(f1);){
	    	int x = fr.read();
	    	while(x != -1) {
	    	System.out.print((char)x);
	    	x= fr.read();
	    	}
	    	
	    }catch(Exception e) {
	    	System.out.println(e.getMessage());
	    }
}
	}


