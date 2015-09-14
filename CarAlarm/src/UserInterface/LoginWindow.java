package UserInterface;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWindow extends JFrame {
	private JTextField UserTextFild;
	private JTextField PasswordTextFild;
	private JButton button;
	public LoginWindow() {
		
		setTitle("Login Panel");
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblUser = new JLabel("User:");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(lblUser, "4, 4, center, default");
		
		UserTextFild = new JTextField();
		getContentPane().add(UserTextFild, "6, 4, left, default");
		UserTextFild.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		getContentPane().add(lblPassword, "4, 8, center, default");
		
		PasswordTextFild = new JTextField();
		getContentPane().add(PasswordTextFild, "6, 8, left, default");
		PasswordTextFild.setColumns(10);
		
		button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		getContentPane().add(button, "6, 10, left, default");
	}

}
