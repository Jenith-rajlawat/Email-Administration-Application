package EmailApplication;

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
	}
	
	
	//Ask for the department
	
	//Generate the random password
	
	//Set the alternate email
	
	//change the password
}
