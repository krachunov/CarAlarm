package UserInterface;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

import usersStuff.User;
import usersStuff.Usermanagment;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWindow extends JFrame {
	private JTextField txtUsername;
	private JTextField txtPassword;
	private String use;
	private String pass;

	public LoginWindow() {
		setTitle("Login Window");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0, 0, 254, 119);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JLabel lblUsername = new JLabel("Username");
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.anchor = GridBagConstraints.EAST;
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 0;
		gbc_lblUsername.gridy = 0;
		getContentPane().add(lblUsername, gbc_lblUsername);

		txtUsername = new JTextField();
		txtUsername.setText("UserName");
		GridBagConstraints gbc_txtUsername = new GridBagConstraints();
		gbc_txtUsername.anchor = GridBagConstraints.WEST;
		gbc_txtUsername.insets = new Insets(0, 0, 5, 0);
		gbc_txtUsername.gridx = 1;
		gbc_txtUsername.gridy = 0;
		getContentPane().add(txtUsername, gbc_txtUsername);
		txtUsername.setColumns(10);

		JLabel lblPassword = new JLabel("password");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 1;
		getContentPane().add(lblPassword, gbc_lblPassword);

		txtPassword = new JPasswordField();
		txtPassword.setText("Password");
		GridBagConstraints gbc_txtPassword = new GridBagConstraints();
		gbc_txtPassword.insets = new Insets(0, 0, 5, 0);
		gbc_txtPassword.anchor = GridBagConstraints.WEST;
		gbc_txtPassword.gridx = 1;
		gbc_txtPassword.gridy = 1;
		getContentPane().add(txtPassword, gbc_txtPassword);
		txtPassword.setColumns(10);

		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
				LoginButton.isSelected();
				System.out.println("AAAAAAAAAAA");
				
				setUse(txtUsername.getText());
				setPass(txtPassword.getText());
				String user = getUse();
				String pass = getPass();
				User u = Usermanagment.logIn(user, pass);
				System.out.println("ID"+u.getUserID()+" User: "+u.getUsername());

			}

		});
		GridBagConstraints gbc_LoginButton = new GridBagConstraints();
		gbc_LoginButton.anchor = GridBagConstraints.WEST;
		gbc_LoginButton.gridx = 1;
		gbc_LoginButton.gridy = 2;
		getContentPane().add(LoginButton, gbc_LoginButton);
	}

	public JTextField getTxtUsername() {
		return txtUsername;
	}

	public void setTxtUsername(JTextField txtUsername) {
		this.txtUsername = txtUsername;
	}

	public JTextField getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(JTextField txtPassword) {
		this.txtPassword = txtPassword;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
