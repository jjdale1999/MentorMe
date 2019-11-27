package mentorshipprog;

public class Person {
    
    //Attributes 
    private String firstName; 
    private String lastName; 
    private String phoneNum;
    private String email;


    public Person(){
        
    }

    //Constructor that accepts the first Name, Last name, Gender and allocates them to their respective attributes
    public Person(String firstName, String lastName,String phonenum, String email){
    	this.phoneNum=phonenum;
    	this.email=email;
        this.firstName = firstName;
        this.lastName = lastName;
        
    }

    //method that sets/change the first Name
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //method that sets/change the last name
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    

    //method that returns the first name
    public String getFirstName(){
        return firstName;
    }

    //methid that returns the last name
    public String getLastName(){
        return lastName;
    }

   

    public void setPhone(String phoneNum){
        this.phoneNum = phoneNum;
        
    }

    public String getPhoneNum(){
        return phoneNum;
    }
    public String getEmail() {
    	return this.email;
    }
    //method to get the full name
    public String getFullName(){
        return getFirstName() + " "+ getLastName();
    }

    public String toString(){
        return "First Name :"+getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" ; 
    }

    public static void main(String[] args) {

        

        
        
    }


}