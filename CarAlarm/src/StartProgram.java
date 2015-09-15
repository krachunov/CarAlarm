import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

import usersStuff.Permissions;
import usersStuff.User;
import usersStuff.Usermanagment;
import UserInterface.LoginWindow;

public class StartProgram {
	public static void main(String[] args) throws DuplicateName {
		Usermanagment um = new Usermanagment();

		um.createUser("admin", "admin", "admin");
		um.createUser("user", "user", "user");

		User user = um.logIn("admin", "admin");
		User user2 = um.logIn("user", "user");

		System.out.println(user.getPermissions().isCanAddnewAgent());

		// LoginWindow lw = new LoginWindow();

		// lw.get
		//
		// User use = um.logIn(user, pass);
		// //TODO
		// System.out.println(use.getUserID());
	}

}
