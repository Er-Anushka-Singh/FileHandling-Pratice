package SerilizationAndDeserilization;
import java.io.*;


public class Deseralization {

	public static void main(String[] args) {
		String filePath = "E:\\EmpolyDetails.src";
		File f1 = new File(filePath);
		
		try(FileInputStream fis = new FileInputStream(f1);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Empoly e1 = (Empoly) ois.readObject();
			Empoly e2 = (Empoly) ois.readObject();
			System.out.println(e1.getDetails());
			System.out.println(e2.getDetails());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("======Program Ends =======");
	}

}
