package mentorshipprog;

import java.util.ArrayList;

public class Assignments {
	
	 public static ArrayList<Mentor> mentorlst = new ArrayList<>();
	 public static ArrayList<Mentee> menteelst = new ArrayList<>();
		public Assignments(Mentee men) {
			menteelst.add(men);
			if(mentorlst.size()==0) {
				System.out.print("No mentees are avaiable rn");
			}
			else {
			assign(mentorlst.get(mentorlst.size()-1),men);}
			
		}
	public Assignments(Mentor men) {
		mentorlst.add(men);
		if(menteelst.size()==0) {
			System.out.print("No mentees are avaiable rn");
		}else {
		assign(men,menteelst.get(menteelst.size()-1));}
		
	}
	public Assignments() {
		
	}
	
	
	
	public void assign(Mentor ment , Mentee men) {
		if(ment.getMajor().equals(men.getMajor())) {
			ment.addMentee(men);
			men.addMentor(ment);
		}else {
			System.out.print("No mentee/Mentor available rn");
		}
	
		
	}
	
	public String toString() {
		String m="";
		for(Mentor el: mentorlst) {
		 m+=el;
		
		}
		return m;
	}
	
	

}
