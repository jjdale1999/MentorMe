package mentorshipprog;

public class loginmanager {
	private String username ="username";
	private String password ="pword";
	
			
	public loginmanager(String username, String password) {
		this.username=username;
		this.password=password;
	}

	public boolean checkcredintials() {
		if(this.username.equals("username") && this.password.equals("pword ")) {
				return true;	
		}
		return false;
	}
}
