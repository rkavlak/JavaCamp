package campHomework4.concrete;

import campHomework4.abstracts.IUserCheckService;
import campHomework4.abstracts.IUserService;
import campHomework4.entities.User;

public class UserManager implements IUserService {

	IUserCheckService userCheckService;
	public UserManager(IUserCheckService userCheckService) {
		
		this.userCheckService = userCheckService;
	}
	
	public UserManager() {
		
	}

	@Override
	public void add(User user) throws Exception {
		if (!userCheckService.checkIfRealPerson(user)) {
			throw new Exception("User undefined, check your information ");	
		}
		System.out.println(user.getFirstName() + " Welcome. You signed in");

	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " You updated your information");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + "You deleted your information");
		
	}



}
