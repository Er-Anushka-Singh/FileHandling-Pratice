package FileHandling.fileHandling;
import java.util.Scanner;
import java.io.*;
public class FileWriting1 {
	public static void main(String[] args) {
		String filePath = "E:\\user.txt";
		File f1 = new File(filePath);
		try(FileWriter fw = new FileWriter(f1,true);
				Scanner sc = new Scanner(System.in);){
			System.out.println("Enter the name : ");
			String name = sc.nextLine();
			System.out.println("Enter the age : ");
			int age = sc.nextInt();
			System.out.println("Enter the weight : ");
			double weight = sc.nextDouble();
			fw.write("Name is : "+name +"\n");
			fw.write("Age is : "+age+" Years \n ");
			fw.write("Weight is : "+weight + " Kg \n");
			fw.write("<===============>\n");
			System.out.println("File writing is completed !\n ");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
