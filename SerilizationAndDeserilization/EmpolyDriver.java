package SerilizationAndDeserilization;
import java.util.Scanner;
import java.io.*;

public class EmpolyDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String name1 = sc.nextLine();
		System.out.println("Enter the user Id : ");
		String uid1 = sc.nextLine();
		System.out.println("Enter the Password : ");
		String password1 = sc.nextLine();
		System.out.println("Enter the Age : ");
		int age1 = sc.nextInt();	
		System.out.println("Enter the Salary");
		double salary1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the Name : ");
		String name2 = sc.nextLine();
		System.out.println("Enter the user Id : ");
		String uid2 = sc.nextLine();
		System.out.println("Enter the Password : ");
		String password2 = sc.nextLine();
		System.out.println("Enter the Age : ");
		int age2 = sc.nextInt();	
		System.out.println("Enter the Salary");
		double salary2 = sc.nextDouble();
		
		Empoly e1 = new Empoly(name1 , uid1 , password1 , age1 , salary1 );
		Empoly e2 = new Empoly(name2 , uid2 , password2 , age2 , salary2 );
		
		String filePath ="E:\\EmpolyDetails.src";
	    File f1 = new File(filePath);
	    
	    try(FileOutputStream fos = new FileOutputStream(f1,true);
	    		ObjectOutputStream oos = new ObjectOutputStream(fos)){
	    	
	    	oos.writeObject(e1);
	    	oos.writeObject(e2);
	    	System.out.println("Serilization is completed ! ........");
	    	
	    	
	    }catch(Exception e) {
	    	System.out.println(e.getMessage());
	    }
	    System.out.println("=========Program Ends==========");
	    
	}

}

