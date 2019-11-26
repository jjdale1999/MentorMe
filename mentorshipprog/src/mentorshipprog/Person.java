package mentorshipprog;

public class Person {
    
    //Attributes 
    private String firstName; 
    private String lastName; 
    private Gender gender;
    private String phoneNum;


    public Person(){
        
    }

    //Constructor that accepts the first Name, Last name, Gender and allocates them to their respective attributes
    public Person(String firstName, String lastName){
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

    //method to set the gender 
    public void setGender(Gender gender){
        this.gender = gender;
    }

    //method that returns the first name
    public String getFirstName(){
        return firstName;
    }

    //methid that returns the last name
    public String getLastName(){
        return lastName;
    }

    //method that returns the enum gender
    public Gender getGender(){
        return gender;
    }

    public void setPhone(String phoneNum){
        this.phoneNum = phoneNum;
        
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    //method to get the full name
    public String getFullName(){
        return getFirstName() + " "+ getLastName();
    }

    public String toString(){
        return "First Name :"+getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" + "Gender : " + getGender(); 
    }

    public static void main(String[] args) {

        Person P1 = new Person();
        Person P2  = new Person("Kim","Brown");

        P1.setFirstName("Joshua");
        P1.setLastName("Luke");
        P1.setGender(Gender.Male);

       //Testing of methods
       System.out.println(P1.toString());
       System.out.println(P2.toString());


       //Test to see if the last name changes : Works
       P2.setLastName("Jones");
       System.out.println(P2.toString());

        
        
    }


}