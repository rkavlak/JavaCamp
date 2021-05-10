package campHomework4.abstracts;

import campHomework4.entities.User;

public interface IUserService {
	void add(User user) throws Exception;
	void delete(User user);
	void update(User user);
}
