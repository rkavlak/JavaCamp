package campHomework5.business.abstracts;

import campHomework5.entities.concrete.User;

public interface LoginService {
	void register(User user);
	void login(String email, String password);
}
