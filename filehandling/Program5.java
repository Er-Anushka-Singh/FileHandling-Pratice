package FileHandling.fileHandling;
import java.io.*;
public class Program5 {
	public static void main(String[] args) {
    try(FileWriter fw = new FileWriter("E:\\abc.txt");){
    	System.out.println("try block");
    }catch(Exception e) {
    	System.out.println("catch block");
    }
	}

}

