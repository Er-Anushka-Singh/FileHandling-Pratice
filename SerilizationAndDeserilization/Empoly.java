package SerilizationAndDeserilization;
import java.io.*;

public class Empoly implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name ;
	String uid;
	String pwd;
	int age;
	double salary;
	
	
	
	Empoly(){
		
	}
	Empoly(String name, String uid , String pwd , int age , double salary ){
		this.name=name;
		this.uid=uid;
		this.pwd=pwd;
		this.age=age;
		this.salary=salary;
		
	}

	public String getDetails() {
		return "Name is : "+name+"\n UserId is : "+uid+"\n Password is : "+pwd+
				"\n Age is : "+age+"\n Salary is : "+salary;
	}
}

