package mentorshipprog;

import java.util.ArrayList;

public class Assignments {
	
	 public static ArrayList<Mentor> mentorlst = new ArrayList<>();
	 public static ArrayList<Mentee> menteelst = new ArrayList<>();

	 //tries to find mentor match for mentee
	 public Assignments(Mentee men) {
	 	boolean assignmentMade = false;
	 	int count = 0;

	 	do while (assignmentMade == false && count < mentorlst.size()) {
	 		Mentor ment = mentorlst.get(count);
			boolean pairAvailable = (ment.status == status.Unavailable) && (men.status == menteeStatus.NotAssigned);
			boolean majorMatch = ment.getMajor().equals(men.getMajor());

			if (pairAvailable && majorMatch) {
				assign(ment, men);
				assignmentMade = true;
			}
			count++;
		}

	 	menteelst.add(men);

	 	if (!assignmentMade) {
	 		System.out.println("We're sorry but we could not find a mentor for you. We'll notify you when on is available.");
		}
	 }

	public Assignments(Mentor ment) {
		boolean assignmentMade = false;
		int count = 0;

		do while (assignmentMade == false && count < menteelst.size()) {
			Mentee men = menteelst.get(count);
			boolean pairAvailable = (ment.status == status.Unavailable) && (men.status == menteeStatus.NotAssigned);
			boolean majorMatch = ment.getMajor().equals(men.getMajor());

			if (pairAvailable && majorMatch) {
				assign(ment, men);
				assignmentMade = true;
			}
			count++;
		}

		mentorlst.add(ment);

		if (!assignmentMade) {
			System.out.println("We're sorry but we could not find a mentee for you. We'll notify you when on is available.");
		}
		
	}

	//assigns mentor to mentee record and mnetee to mentor record.
	public void assign(Mentor ment, Mentee men) {
	 	ment.addMentee(men);
	 	men.addMentor(men);
	}

	
	public String toString() {
		String m="";
		for(Mentor el: mentorlst) {
		 m+=el;
		
		}
		return m;
	}
	

}
