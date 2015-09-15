package usersStuff;

import java.util.List;
import java.util.TreeMap;

import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

public class Usermanagment {
	public static int currentNumOfUsers = 0;
	private TreeMap<String, User> users;

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
	public int createUser(String username, String password, String permissions)
			throws DuplicateName {

		if (!getUsers().containsKey(username)) {
			Permissions prm = new Permissions();

			if (permissions.equals("admin")) {
				prm.makeAdmin();
			} else {
				prm.makeAgentUser();
			}
			User newUserObject = new User(username, password);
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

	public User logIn(String username, String password) {
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

	public TreeMap<String, User> getUsers() {
		return users;
	}

	public void setUsers(TreeMap<String, User> users) {
		this.users = users;
	}

}
