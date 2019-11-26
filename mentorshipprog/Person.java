package mentorshipprog;


/**
 * @author Jordanne Dale
 * @version 1.0
 * @since March 2019
 * Person.java Person.class
 */

import java.util.ArrayList;

public class Person {
	protected String fname;
	protected String lname;
	protected String phonenum;
	protected String email;
	
	
	public Person(String fname, String lname, String phonenum,String email) {
		this.fname=fname;
		this.lname=lname;
		this.phonenum=phonenum;
		this.email=email;

	}

	/**
	 * This is a Getter Method that gets a person name
	 * <p>
	 * 
	 * @return a person firstname and lastname in the format FirstName LastName
	 *         <p>
	 *         Data Type : String
	 */
	public String getName() {
		return this.fname + " " + this.lname;
		// or
		// return this.firstname+this.lastname;
	}
	
	public String getfname() {
		return this.fname;
	}
	
	public String getlname() {
		return this.lname;
	}
	
	public String getPhonenum() {
		return this.phonenum;
	}
	
	public String getEmail() {
		return this.email;
	}
	/**
	 * This is a Mutator Method that changes a person's last name
	 * 
	 * @param newName represents the last name of the person Return data type: void
	 * 
	 */
	public void changeLastName(String newName) {
		// this.lastname=newName;
		this.lname=newName;
	}
	public void changeFirstName(String newName) {
		// this.lastname=newName;
		this.fname=newName;
	}
	public void changeEmail(String newEmail) {
		// this.lastname=newName;
		this.email=newEmail;
	}
	
	public void chnagePhonenum(String newPhonenum) {
		// this.lastname=newName;
		this.phonenum=newPhonenum;
	}
	
	

}
