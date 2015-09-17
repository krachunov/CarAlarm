package usersStuff;

import java.util.List;
import java.util.TreeMap;

import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

public class Usermanagment {
	public static int currentNumOfUsers = 0;
	private static TreeMap<String, User> users = new TreeMap<String, User>();

	public Usermanagment() {
		setUsers(new TreeMap<String, User>());
	}

	/**
	 * 
	 * @param username
	 *            - user name
	 * @param password
	 *            - password
	 * @param permission
	 *            - permission
	 * @return
	 * @throws DuplicateName
	 */
	public static int createUser(String username, String password,
			boolean permissions) throws DuplicateName {

		if (!getUsers().containsKey(username)) {
			Permissions prm = new Permissions();
			User newUserObject = new User(username, password);

			if (permissions) {
				newUserObject.setADmin(true);
				prm.makeAdmin();
			} else {
				prm.makeAgentUser();
			}
			newUserObject.setPermissions(prm);
			getUsers().put(username, newUserObject);
		} else {
			throw new DuplicateName("User with this username \"" + username
					+ "\" already exist");
		}

		return currentNumOfUsers++;
	}

	public User selectUserById(int userId) {
		return getUsers().get(currentNumOfUsers);
	}

	public static User logIn(String username, String password) {
		if (getUsers().containsKey(username)) {
			User user = getUsers().get(username);
			if (user.getPassword().equals(password)) {
				return user;
			} else {
				throw new IllegalAccessError("The password dosn't match");
			}
		} else {
			throw new IllegalAccessError("There is no such user");

		}
	}

	public static int getCurrentNumOfUsers() {
		return currentNumOfUsers;
	}

	public static void setCurrentNumOfUsers(int currentNumOfUsers) {
		Usermanagment.currentNumOfUsers = currentNumOfUsers;
	}

	public static TreeMap<String, User> getUsers() {
		return users;
	}

	public static void setUsers(TreeMap<String, User> users) {
		Usermanagment.users = users;
	}

}
