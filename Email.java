package EmailApplication;

import java.util.Scanner;

public class Email {
	private String firstName; //set as private to ensure encapsulation
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity;
	private String alternateEmail;
	
	//Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName=firstName; //this refers to the class variable not the local one
		this.lastName=lastName;
		System.out.println("Email Created: "+this.firstName+" "+ this.lastName);
		
		//Call a method asking for the department -returns department
		this.department=setDepartment();
		System.out.println("Department: "+this.department);
	}
	
	
	//Ask for the department
	private String setDepartment() {
		System.out.println(" DEPARTMENT CODES\n1) For Sales\n2) For Development\n3) For Accounting\n0) For none\n Enter department code: ");
		Scanner in = new Scanner(System.in); //in eclipse ctrl+shift+o to import libraries
		int choice;
		choice=in.nextInt();
		if(choice==1) {return "Sales";	}
		else if(choice==2) {return "Development";} //ctril+alt+downarrow to duplicate selected line
		else if(choice==3) {return "Account";}
		else {return "";}
		
	}
	
	//Generate the random password
	
	//Set the alternate email
	
	//change the password
}
