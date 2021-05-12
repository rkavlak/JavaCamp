package campHomework5.business.concretes;

import campHomework5.business.abstracts.LoginService;
import campHomework5.core.abstracts.CheckService;
import campHomework5.core.abstracts.EmailService;
import campHomework5.dataAccess.abstracts.UserDao;
import campHomework5.entities.concrete.User;


public class LoginManager implements LoginService{

	private EmailService emailService;
	private CheckService checkService;
	private UserDao userDao;
	
	public LoginManager(EmailService emailService, CheckService checkService, UserDao userDao) {
		super();
		this.emailService = emailService;
		this.checkService = checkService;
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		
		if (!userDao.checkEmailExists(user)) {
			System.out.println("Registiration failed.\n" + user.getEmail() + " This email has been used before");
			return;
		}
		if (checkService.checkFirstName(user.getFirstName())) {
			System.out.println("Firt name verified");
		}
		else {
			return;
		}
		if (checkService.checkLastName(user.getLastName())) {
			System.out.println("Last name verified");
		}
		else {
			return;
		}
		if (checkService.checkEmail(user.getEmail())) {
			System.out.println("Email verified");
		}
		else {
			return;
		}
		if (checkService.checkPassword(user.getPassword())) {
			System.out.println("Password verified");
		}
		else {
			return;
		}
		
		emailService.sendVerifyEmail(user);
		emailService.clickToVerify(user);
		userDao.add(user);
		System.out.println("Registration is successful. Hi, dear " + user.getFirstName() + " !");
		
	}
	@Override
	public void login(String email, String password) {
		for (User users : userDao.getAll()) {
			if (email==users.getEmail()) {
				
				if(password!=users.getPassword()) {
					System.out.println("Login failed. Check your email or password!");
					return;
				}
				System.out.println("Login successful");
				return;
				
			}

		}
		
	}

}
