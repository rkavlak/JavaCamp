
public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getName() + " " + user.getLastName() + " successfuly logged in");
	}
	
	public void logout(User user) {
		System.out.println(user.getName() + " " + user.getLastName() + " successfuly logged out");
	}
	
	
}
