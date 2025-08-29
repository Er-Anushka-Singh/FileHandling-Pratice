package FileHandling.fileHandling;
import java.io.*;
import java.util.Scanner;
public class FileWriting2 {
	public static void main(String[] args) {
		String filePath = "E:\\user1.txt";
		File f1 =new  File(filePath);
		try( FileWriter fw = new FileWriter(f1 , true);
				BufferedWriter bw = new BufferedWriter(fw);
			 Scanner sc = new Scanner(System.in);){
			 System.out.println("Enter the name : ");
		   	String name = sc.nextLine();
			System.out.println("Enter the age : ");
			int age = sc.nextInt();
			System.out.println("Enter the weight : ");
			double weight = sc.nextDouble();
			bw.write("Name is : "+name +"\n");
			bw.write("Age is : "+age+" Years \n ");
			bw.write("Weight is : "+weight + " Kg \n");
			bw.write("<===============>\n");
			System.out.println("File writing is completed !\n ");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
