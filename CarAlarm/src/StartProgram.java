import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

import usersStuff.Permissions;
import usersStuff.User;
import usersStuff.Usermanagment;
import UserInterface.LoginWindow;

public class StartProgram {
	public static void main(String[] args) throws DuplicateName {
//		Usermanagment um = new Usermanagment();
//
//		um.createUser("admin", "admin", "admin");
//		um.createUser("user", "user", "user");

		LoginWindow lw = new LoginWindow();
		lw.setVisible(true);
		String a = lw.getTxtPassword().getText();
		System.out.println(a);
		// User user = um.logIn(use, pass);
		// User user2 = um.logIn("user", "user");
		// System.out.println(user.getPermissions().isCanAddnewAgent());

	}

}
