package userInterface;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateNewUsers extends JFrame {
	private JTextField userField;
	private JTextField passwordField;
	private JTextField repeatPasswordField;
	private JRadioButton adminPermissionRadioButton;
	private JRadioButton userPermissionRadioButton;
	private JButton btnCreate;
	private JButton btnCancel;

	public CreateNewUsers() {
		setTitle("Create new User");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 56, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JLabel lblUserName = new JLabel("User name");
		GridBagConstraints gbc_lblUserName = new GridBagConstraints();
		gbc_lblUserName.anchor = GridBagConstraints.EAST;
		gbc_lblUserName.insets = new Insets(0, 0, 5, 5);
		gbc_lblUserName.gridx = 0;
		gbc_lblUserName.gridy = 2;
		getContentPane().add(lblUserName, gbc_lblUserName);

		userField = new JTextField();
		GridBagConstraints gbc_userField = new GridBagConstraints();
		gbc_userField.anchor = GridBagConstraints.WEST;
		gbc_userField.insets = new Insets(0, 0, 5, 5);
		gbc_userField.gridx = 1;
		gbc_userField.gridy = 2;
		getContentPane().add(userField, gbc_userField);
		userField.setColumns(10);


		JLabel lblPassword = new JLabel("Password");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 3;
		getContentPane().add(lblPassword, gbc_lblPassword);

		passwordField = new JTextField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.anchor = GridBagConstraints.WEST;
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 3;
		getContentPane().add(passwordField, gbc_passwordField);
		passwordField.setColumns(10);

		JLabel lblRepeatPassword = new JLabel("Repeat password");
		GridBagConstraints gbc_lblRepeatPassword = new GridBagConstraints();
		gbc_lblRepeatPassword.anchor = GridBagConstraints.EAST;
		gbc_lblRepeatPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblRepeatPassword.gridx = 0;
		gbc_lblRepeatPassword.gridy = 4;
		getContentPane().add(lblRepeatPassword, gbc_lblRepeatPassword);

		repeatPasswordField = new JTextField();
		GridBagConstraints gbc_repeatPasswordField = new GridBagConstraints();
		gbc_repeatPasswordField.anchor = GridBagConstraints.WEST;
		gbc_repeatPasswordField.insets = new Insets(0, 0, 5, 5);
		gbc_repeatPasswordField.gridx = 1;
		gbc_repeatPasswordField.gridy = 4;
		getContentPane().add(repeatPasswordField, gbc_repeatPasswordField);
		repeatPasswordField.setColumns(10);

		JLabel lblAdminPermission = new JLabel(
				"Admin permission");
		GridBagConstraints gbc_lblAdminPermission = new GridBagConstraints();
		gbc_lblAdminPermission.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdminPermission.gridx = 0;
		gbc_lblAdminPermission.gridy = 5;
		getContentPane().add(lblAdminPermission, gbc_lblAdminPermission);

		adminPermissionRadioButton = new JRadioButton("Set Admin");
		GridBagConstraints gbc_adminPermissionRadioButton = new GridBagConstraints();
		gbc_adminPermissionRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_adminPermissionRadioButton.anchor = GridBagConstraints.WEST;
		gbc_adminPermissionRadioButton.gridx = 1;
		gbc_adminPermissionRadioButton.gridy = 5;
		getContentPane().add(adminPermissionRadioButton,
				gbc_adminPermissionRadioButton);
		

		JLabel lblUserPermission = new JLabel("User permission");
		GridBagConstraints gbc_lblUserPermission = new GridBagConstraints();
		gbc_lblUserPermission.insets = new Insets(0, 0, 5, 5);
		gbc_lblUserPermission.gridx = 0;
		gbc_lblUserPermission.gridy = 6;
		getContentPane().add(lblUserPermission, gbc_lblUserPermission);

		userPermissionRadioButton = new JRadioButton("Set User", true);
		GridBagConstraints gbc_userPermissionRadioButton = new GridBagConstraints();
		gbc_userPermissionRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_userPermissionRadioButton.anchor = GridBagConstraints.WEST;
		gbc_userPermissionRadioButton.gridx = 1;
		gbc_userPermissionRadioButton.gridy = 6;
		getContentPane().add(userPermissionRadioButton,
				gbc_userPermissionRadioButton);


		btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		GridBagConstraints gbc_btnCreate = new GridBagConstraints();
		gbc_btnCreate.anchor = GridBagConstraints.WEST;
		gbc_btnCreate.insets = new Insets(0, 0, 5, 0);
		gbc_btnCreate.gridx = 3;
		gbc_btnCreate.gridy = 7;
		getContentPane().add(btnCreate, gbc_btnCreate);

		btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.anchor = GridBagConstraints.WEST;
		gbc_btnCancel.gridx = 3;
		gbc_btnCancel.gridy = 8;
		getContentPane().add(btnCancel, gbc_btnCancel);
	}

}
