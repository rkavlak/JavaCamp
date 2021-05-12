package campHomework5.business.concretes;

import campHomework5.business.abstracts.LoginService;
import campHomework5.business.abstracts.UserService;
import campHomework5.core.abstracts.CheckService;
import campHomework5.core.abstracts.GoogleService;
import campHomework5.entities.concrete.User;

public class UserManager implements UserService {

	private LoginService loginService;
	private GoogleService googleService;
	
	public UserManager(LoginService loginService, GoogleService googleService) {
		
		this.loginService = loginService;
		this.googleService = googleService;
	}

	@Override
	public void register(User user) {
		loginService.register(user);
		
	}

	@Override
	public void login(String email, String password) {
		loginService.login(email, password);

		
	}

	@Override
	public void registerToGoogle() {
		googleService.registerToSystem();
		
	}

}
