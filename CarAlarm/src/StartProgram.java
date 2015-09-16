import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

import usersStuff.Permissions;
import usersStuff.User;
import usersStuff.Usermanagment;
import UserInterface.LoginWindow;

public class StartProgram {
	public static void main(String[] args) throws DuplicateName {
		System.out.println("Wadsaaa");
		Usermanagment um = new Usermanagment();

		um.createUser("admin", "admin", "admin");
		um.createUser("user", "user", "user");

		LoginWindow lw = new LoginWindow();
		lw.setVisible(true);
		String user = lw.getTxtPassword().getText();
		String pass = lw.getTxtPassword().getText();
		
		System.out.println("U: "+user+" P: "+pass);


	}

}
