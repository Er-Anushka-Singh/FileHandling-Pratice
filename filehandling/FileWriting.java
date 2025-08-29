package FileHandling.fileHandling;
import java.io.*;

public class FileWriting {
	public static void main(String[] args) {
	String filePath = "E:\\user.txt";
	File f1 = new File(filePath);
	try(FileWriter fw = new FileWriter(f1 , true);){
		fw.write(65);
		fw.write("65\n");
		fw.write("Guru\n");
		System.out.println("File Writing is completed !");
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
	}

}
