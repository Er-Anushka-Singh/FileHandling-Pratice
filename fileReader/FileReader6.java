package FileHandling-Pratice.fileReader;
import java.io.*;
import java.util.Scanner;

public class FileReader6 {

	public static void main(String[] args) {
		String filePath = "E:\\user1.txt";
		File f1 = new File(filePath);
		
		try(Scanner sc = new Scanner(f1)){
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}

