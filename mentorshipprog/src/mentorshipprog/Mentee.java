package mentorshipprog;

import java.util.*;

public class Mentee extends Person {

    private String major;
    private Mentor mentor;
    private MenteeStatus menteeStatus;
    private ArrayList <Mentor> mentorList = new ArrayList<Mentor>();
 
    public Mentee(String firstName, String lastName, String major){
        super(firstName,lastName);
        this.major = major;
        menteeStatus = MenteeStatus.NotAssigned;
    }



    //returns the Major 
    public String getMajor(){
        return major;
    }


    //sets the Major 
    public void changeMajor(String major){
        this.major = major;
    }

    //Adds one mentor to mentee
    public void addMentor(Mentor mentor){
        this.mentor = mentor;
        if(menteeStatus == MenteeStatus.NotAssigned){
            if(mentor.getStatus() == "isAvailable"){
                mentorList.add(mentor);
                menteeStatus = MenteeStatus.isAssigned;
            }else if(mentor.getStatus() == "Unavailable" ){
                System.out.println(mentor.getFullName() + " is an unavailable mentor");
            }
        }else if(menteeStatus == MenteeStatus.isAssigned){
            System.out.println( getFullName() + " is already assigned a mentor");
        }

        
        
    }

    //retrieve the full name of the Mentee's Mentor
    public String getMentor(){
        if (isAssigned() == true){
            return mentor.getFullName();
        }
        else {
            return "Not Applicable";
        }
    }

    public String getMenteeStatus(){
        if(menteeStatus == MenteeStatus.isAssigned){
            return menteeStatus.toString();
        }else{
            return menteeStatus.toString();
        }
    }

    //returns true if the mentee is already assigned a mentor
    private Boolean isAssigned(){
        if(menteeStatus == MenteeStatus.isAssigned){
            return true;
        }
        else{
            return false;
        }
        
    }

    //ToString method
    public String toString(){
        return "First Name : " +getFirstName()+"\n"+ "Last Name : "+getLastName() +"\n"+"Gender : "+getGender()+"\n"
        +"\n"+ "Major : "+getMajor()+ "\n"+ "Mentor : "+ getMentor()+"\n"+"status :" + getMenteeStatus();
    }


    
    
}