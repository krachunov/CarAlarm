package userInterface;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdministratorPanel extends JFrame {
	public AdministratorPanel() {
		JButton AddNewAgentButton;
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

		AddNewAgentButton = new JButton("New Agent");
		NewClientButton = new JButton("New Client");
		NewCarButton = new JButton("New Car");
		NewPolicyButton = new JButton("New Policy");

		getContentPane().add(AddNewAgentButton, "2, 2");
		getContentPane().add(NewClientButton, "4, 2");
		getContentPane().add(NewCarButton, "6, 2");
		getContentPane().add(NewPolicyButton, "8, 2");

	}

}
