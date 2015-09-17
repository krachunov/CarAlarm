import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

import usersStuff.Permissions;
import usersStuff.User;
import usersStuff.Usermanagment;
import UserInterface.LoginWindow;

public class StartProgram {
	public static void main(String[] args) throws DuplicateName {
		System.out.println("Start");


		Usermanagment.createUser("admin", "admin", "admin");
		Usermanagment.createUser("user", "user", "user");

		LoginWindow lw = new LoginWindow();
		lw.setVisible(true);
		// String user = lw.getUse();
		// String pass = lw.getPass();
		//
		// System.out.println("U: "+user+" P: "+pass);


	}

}
