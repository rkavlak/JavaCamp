package campHomework4.concrete;

import campHomework4.abstracts.IUserCheckService;
import campHomework4.entities.User;

public class UserCheckManager implements IUserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		
		return false;
	}

}
