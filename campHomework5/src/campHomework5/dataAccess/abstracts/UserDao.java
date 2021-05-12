package campHomework5.dataAccess.abstracts;

import java.util.List;

import campHomework5.entities.concrete.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	List<User> getAll();
	boolean checkEmailExists(User user);
	
}
