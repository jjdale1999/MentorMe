/**
 * 
 */
package mentorshipprog;

/**
 * @author jordannedale
 *
 */


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import mentorshipprog.LoginForm;
import mentorshipprog.MainScreen;

public class DataManager {
	private ArrayList<Mentor> carray = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	private ArrayList<String> listuparray = new ArrayList<>();
	private int counter = 0;
	private int length = 3;
	private boolean run = false;
	private boolean control = true;

	private static ArrayList<String> arra = new ArrayList<>();
	String uparray1;
	String username = "";
	String file1 = "";
	String textforfile = "";

	public DataManager() {

	}

	public String getUserName() {
		return this.username;
	}

	public void addtoFile(String file1) {
		try {
			PrintWriter fw = new PrintWriter(new FileWriter(file1));
			for (Mentor el : carray) {
				System.out.println(el);
			}
			for (Mentor el : carray) {

				arraadd(el.getName().split(",")[0], el.getName().split(",")[1], 
						el.getEmail(),el.getMentees());

			}

			for (String e : arra) {
				textforfile += e + "\n";
				System.out.print(e);
			}
			fw.write(textforfile);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readfromfile(String file) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readMentors(String file) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			while (line != null) {
				String[] linearray = line.split(":");
				String fname = linearray[1];
				String lname = linearray[0];
				String phonenum = linearray[2];
				String email = linearray[3];
				String alias = linearray[5];
				// firstname:lastname:phonenum:email:[mentees]
				Mentor c1 = new Mentor(fname, lname, phonenum, email);
				carray.add(c1);
				line = br.readLine();

			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public String getfilename() {
		return this.file1;
	}

	public void setfileName(String file) {
		this.file1 = file;
	}

	

	public void addconta(Mentor con) {
		carray.add(con);
	}

	public ArrayList<Mentor> getcontactarray() {
		return carray;
	}

	public String[] getarra() {
		return arra.toArray(new String[arra.size()]);
	}

	public void arraadd(String fname, String lname,String emailaddress,
			String[] mentees) {

		String info = fname + ":" + lname + ":" + emailaddress +":" + String.join(";", mentees);
		arra.add(info);
	}

}
