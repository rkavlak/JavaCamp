package campHomework5.core.abstracts;

import campHomework5.entities.concrete.User;

public interface EmailService {
	void sendVerifyEmail(User user);
	void clickToVerify(User user);
}
