package mentorshipprog;

import java.util.*;
public class Mentor extends Person {

    private Mentee mentee;
    private ArrayList <Mentee> menteeList = new ArrayList<Mentee>(3);
    private ArrayList <String> menteePrint = new ArrayList<String>(3);
    private Status status; 
    private String major;
   
    

    public Mentor(String firstName, String lastName, String major){
        super(firstName,lastName);
        this.major = major;
        status = Status.isAvailable;
    }

    //returns the Major
    public String getMajor(){
        return major;
    }

    //sets the Major
    public void changeMajor(String major ){
        this.major = major;
    }


    public void addMentee(Mentee mentee){
        this.mentee = mentee;
        
        if(status == Status.isAvailable){
            if(menteeList.size() <2){
                menteeList.add(mentee);
                
            }else if(menteeList.size() == 2){
                menteeList.add(mentee);
                //status = Status.Unavailable;
            }
        }
        if(menteeList.size() == 3 ){
            status = Status.Unavailable;
        }

        if(status == Status.Unavailable){
            //if(menteeList.size())
            System.out.println("This mentor is unavailable for any more mentees");

        }
    }

    //retrieve the mentees of this mentor
    public ArrayList<String> getMentees() {
        for(Mentee i : menteeList){
            menteePrint.add(i.getFirstName());
        }
        return menteePrint;
    }

    //Sets the status of the mentor
    public void setStatus(Status status){
        this.status = status;
    }

    //returns the status of the mentor
    public String getStatus(){
        return status.toString();
        
    }




    //toString method
    public String toString(){
        return "Full Name: "+ getFullName() + "\n"+
                "Mentees :" + getMentees() + "\n"+
                "Gender : " + getGender() + "\n"+
                "Major :" +getMajor()+"\n"+
                "Status :" +getStatus();
    }



    public static void main(String[] args) {
        
//        Mentee Me1 = new Mentee("Jason","Gayle","COMSCI");
//        Mentee Me2 = new Mentee("Mario","Anckle","COMSCI");
//        Mentor  M1 = new Mentor("Javon","Ellis","COMPSCI");
//        Mentee Me4 =  new Mentee("Test", "lastName", "COMPSCI");
//        Mentee Me3 = new Mentee("Kimberly", "Lynch", "COMPSCI");
//        Mentor M2 = new Mentor("Jordanne", "Dale",  "COMPSCI");
//        Mentee Me5 = new Mentee("firstName", "lastName", "major");
//        Me2.addMentor(M2);
//        Me1.addMentor(M1);
//        M1.addMentee(Me1);
//        M1.setStatus(Status.Unavailable);
//        M1.addMentee(Me2);
//        //M1.addMentee(Me3);
//        //M1.addMentee(Me4);
//
//        M2.addMentee(Me2);
//        Me2.addMentor(M2);
//        M2.addMentee(Me3);
//        Me3.addMentor(M2);
//        M2.addMentee(Me4);
//        Me4.addMentor(M2);
//
//        
//
//        //System.out.println(Me1.toString());
//        //System.out.println(Me2.toString());
//        //System.err.println(Me2.getMenteeStatus());
//        System.out.println(M2.toString());
//        System.out.println(M1.toString());
//        System.out.println(Me1.toString());
//        System.out.println(Me2.toString());
//        System.out.println(Me3.toString());
//        System.out.println(Me4.toString());
//        System.out.println(Me5.toString());




    }







    







    
}