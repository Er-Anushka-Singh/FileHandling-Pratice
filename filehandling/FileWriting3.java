package FileHandling.fileHandling;
import java.io.*;
import java.util.Scanner;
public class FileWriting3 {
	public static void main(String[] args) {
	String filePath = "E:\\user1.txt";
	File f1 = new File(filePath);
	try(FileOutputStream fos = new FileOutputStream(f1, true);
			Scanner sc = new Scanner(System.in);){
		    System.out.println("Enter the name : ");
		   	String name = sc.nextLine();
			System.out.println("Enter the age : ");
			int age = sc.nextInt();
			System.out.println("Enter the weight : ");
			double weight = sc.nextDouble();
			fos.write(("Name is : "+name +"\n").getBytes());
			fos.write(("Age is : "+age+" Years \n ").getBytes());
			fos.write(("Weight is : "+weight + " Kg \n").getBytes());
			fos.write(("<===============>\n").getBytes());
			System.out.println("File writing is completed !\n ");
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}

	}

}

