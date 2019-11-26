package mentorshipprog;

public class Loginmanager {
	private String username ="username";
	private String password ="pword";
	
			
	public Loginmanager(String username, String password) {
		System.out.print(password.equals(this.password));
		
		this.username=username;
		this.password=password;
	}

	public boolean checkcredintials() {
		if(this.username.equals("username") && this.password.equals("pword")) {
				return true;	
		}
		return false;
	}
}
