package campHomework5.core.concretes;

import campHomework5.core.abstracts.EmailService;
import campHomework5.entities.concrete.User;

public class EmailManager implements EmailService {

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("Your verification link has been send to your email: " + user.getEmail());
		
	}

	@Override
	public void clickToVerify(User user) {
		System.out.println("Click on the verification and verify your email: " + user.getFirstName());
		
	}

}
