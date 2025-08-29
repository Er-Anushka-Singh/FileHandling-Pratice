package FileHandling.fileHandling;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number : ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Nmuber : ");
		int b = sc.nextInt();
		System.out.println("Sum of a and b : "+(a+b));
		try {
		System.out.println("Divison of a and b : "+(a/b));
		
		}
		catch(Exception e ){
			System.out.println("infinite");
		}
		System.out.println("Product of a and b : "+(a*b));
	}

}

