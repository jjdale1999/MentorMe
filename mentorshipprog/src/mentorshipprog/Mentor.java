package mentorshipprog;


/**
 * @author Jordanne Dale
 * @version 1.0
 * @since March 2019
 * Contact.java Contact.class
 */



//import java.time.Period;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Calendar;

import java.util.Arrays;

/**
 * Class inherits from Person Class
 * 
 * 
 */
public class Mentor extends Person {
// attributes
	private static int count = 1;
	private int entryno = 0; // stores and tracks a customer's entrynumber
	private String alias; // stores a customer's alias
	private String email; // stores  email address
	private String phonearray;//
	private String[] menteelst;
	


	public Mentor(String fname, String lname,String phonenum,String email) {
		
		super(fname, lname,phonenum,email);
		this.entryno = count;
		count++;
	}

	

	/**
	 * This is a Getter Method that gets a contact full name
	 * <p>
	 * 
	 * @return the first and last name of a contact
	 *         <p>
	 *         In the format of LastName, FirstName
	 *         <p>
	 *         Return Data Type : String
	 */
	public String getName() {
		return super.getName();
	}
	public String getphonenum() {
		return super.getPhonenum();
	}
	public String getEmail() {
		return super.getEmail();
	}
	
	public String [] getMentees(){
		return this.menteelst;
	}
	/**
	 * This is a Mutator Method that updates a contact last name
	 * <p>
	 * using the super class method changeLastName()
	 * 
	 * @param name the last name to replace current last name (data type : String)
	 *             <p>
	 *             Return Data Type : void
	 */
	public void updateLastName(String name) {
		super.changeLastName(name);
	}
	
	public void updateFirstName(String name) {
		super.changeFirstName(name);
	}

	public void updateEmail(String name) {
		super.changeEmail(name);
	}
	
	public void updatePhone(String phonenum) {
		super.chnagePhonenum(phonenum);
	}
	
	

	
	

	
}
