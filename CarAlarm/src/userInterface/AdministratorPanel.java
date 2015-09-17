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
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class AdministratorPanel extends JFrame {
	JButton AddNewAgentButton;
	JButton NewClientButton;
	JButton NewCarButton;
	JButton NewPolicyButton;

	public AdministratorPanel() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 250);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{85, 83, 73, 83, 0};
		gridBagLayout.rowHeights = new int[]{90, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
				AddNewAgentButton = new JButton("New Agent");
				
						GridBagConstraints gbc_AddNewAgentButton = new GridBagConstraints();
						gbc_AddNewAgentButton.anchor = GridBagConstraints.WEST;
						gbc_AddNewAgentButton.insets = new Insets(0, 0, 5, 5);
						gbc_AddNewAgentButton.gridx = 0;
						gbc_AddNewAgentButton.gridy = 0;
						getContentPane().add(AddNewAgentButton, gbc_AddNewAgentButton);
		NewClientButton = new JButton("New Client");
		GridBagConstraints gbc_NewClientButton = new GridBagConstraints();
		gbc_NewClientButton.anchor = GridBagConstraints.WEST;
		gbc_NewClientButton.insets = new Insets(0, 0, 5, 5);
		gbc_NewClientButton.gridx = 1;
		gbc_NewClientButton.gridy = 0;
		getContentPane().add(NewClientButton, gbc_NewClientButton);
		NewCarButton = new JButton("New Car");
		GridBagConstraints gbc_NewCarButton = new GridBagConstraints();
		gbc_NewCarButton.anchor = GridBagConstraints.WEST;
		gbc_NewCarButton.insets = new Insets(0, 0, 5, 5);
		gbc_NewCarButton.gridx = 2;
		gbc_NewCarButton.gridy = 0;
		getContentPane().add(NewCarButton, gbc_NewCarButton);
		NewPolicyButton = new JButton("New Policy");
		GridBagConstraints gbc_NewPolicyButton = new GridBagConstraints();
		gbc_NewPolicyButton.insets = new Insets(0, 0, 5, 0);
		gbc_NewPolicyButton.anchor = GridBagConstraints.WEST;
		gbc_NewPolicyButton.gridx = 3;
		gbc_NewPolicyButton.gridy = 0;
		getContentPane().add(NewPolicyButton, gbc_NewPolicyButton);

	}

}
