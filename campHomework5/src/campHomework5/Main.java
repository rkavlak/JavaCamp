package campHomework5;

import campHomework5.business.abstracts.UserService;
import campHomework5.business.concretes.LoginManager;
import campHomework5.business.concretes.UserManager;
import campHomework5.core.adapters.GoogleManagerAdapter;
import campHomework5.core.concretes.CheckManager;
import campHomework5.core.concretes.EmailManager;
import campHomework5.dataAccess.concretes.InMemoryUserDao;
import campHomework5.entities.concrete.User;

public class Main {

	public static void main(String[] args) {
		

		UserService userService=new UserManager(new LoginManager(new EmailManager(), new CheckManager(), new InMemoryUserDao()), 
				new GoogleManagerAdapter()); 
		
		User user = new User(1, "Ramazan", "KAVLAK","ramazan@gmail.com","159753456");
		userService.register(user);
		userService.login("ramazan@gmail.com", "159753456");
		
		System.out.println("Google simulated");
		userService.registerToGoogle();
		
		User user1 = new User(2, "Dilan", "ÇINAR", "dilan@gmail.com","159753456");
		userService.register(user1);
		userService.login("dilan@gmail.com", "159");
		
		
		
		
	}

}
