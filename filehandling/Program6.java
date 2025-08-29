package FileHandling.fileHandling;
import java.io.*;
public class Program6 {
	public static void main(String[] args) {
		String filePath = "E:\\abc.txt";
	   	File f1 = new File(filePath);
	   	System.out.println(f1.exists());
	   	System.out.println(f1.length());
	   	System.out.println(f1.canRead());
	   	System.out.println(f1.canWrite());
	   	f1.setWritable(false);
	   	System.out.println(f1.getName());
	   	System.out.println(f1.getPath());
	   	System.out.println(f1.getAbsolutePath());
	   	try {
			System.out.println(f1.getCanonicalPath());
		} catch (IOException e) {
			System.out.println("Expection caught! ");
		}
	   	f1.setWritable(true);
	   	
	}

}

