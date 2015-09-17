package userInterface;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class UserPanel extends JFrame {
	public UserPanel() {
		JButton NewClientButton;
		JButton NewCarButton;
		JButton NewPolicyButton;

		getContentPane().setLayout(
				new FormLayout(new ColumnSpec[] {
						FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.DEFAULT_COLSPEC, }, new RowSpec[] {
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, }));

		NewClientButton = new JButton("New Client");
		NewCarButton = new JButton("New Car");
		NewPolicyButton = new JButton("New Policy");

		getContentPane().add(NewClientButton, "4, 2");
		getContentPane().add(NewCarButton, "6, 2");
		getContentPane().add(NewPolicyButton, "8, 2");

	}
}
