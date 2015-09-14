package usersStuff;

import java.util.List;
import java.util.TreeMap;

import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

public class Usermanagment {
	public static int currentNumOfUsers = 0;
	private TreeMap<String, User> users;

	public int createUser(String username, String password)
			throws DuplicateName {

		if (!getUsers().containsKey(username)) {
			getUsers().put(username, new User(username, password));
		} else {
			throw new DuplicateName(
					"User with this username and ID already exist");
		}

		return currentNumOfUsers++;
	}

	public User selectUserById(int userId) {
		return getUsers().get(currentNumOfUsers);
	}

	public User logIn(String username, String password) {
		if (getUsers().containsKey(username)) {
			User user = getUsers().get(username);
			if (user.getPassword().equals(password)) {
				return user;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	public static int getCurrentNumOfUsers() {
		return currentNumOfUsers;
	}

	public static void setCurrentNumOfUsers(int currentNumOfUsers) {
		Usermanagment.currentNumOfUsers = currentNumOfUsers;
	}

	public TreeMap<String, User> getUsers() {
		return users;
	}

	public void setUsers(TreeMap<String, User> users) {
		this.users = users;
	}

}
