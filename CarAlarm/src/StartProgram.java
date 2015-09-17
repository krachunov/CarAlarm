import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

import userInterface.LoginWindow;
import usersStuff.Permissions;
import usersStuff.User;
import usersStuff.Usermanagment;

public class StartProgram {
	public static void main(String[] args) throws DuplicateName {
		System.out.println("Start");


		Usermanagment.createUser("admin", "admin", true);
		Usermanagment.createUser("user", "user", false);

		LoginWindow lw = new LoginWindow();
		lw.setVisible(true);
		// String user = lw.getUse();
		// String pass = lw.getPass();
		//
		// System.out.println("U: "+user+" P: "+pass);


	}

}
