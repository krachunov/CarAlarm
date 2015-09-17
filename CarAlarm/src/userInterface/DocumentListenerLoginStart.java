package userInterface;

import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;

public class DocumentListenerLoginStart implements
		javax.swing.event.DocumentListener {

	private JTextField fild;
	private JButton button;

	/**
	 * 
	 * @param fild
	 *            - right which must be completed
	 * @param button
	 *            - button to be activated
	 */
	public DocumentListenerLoginStart(JTextField fild) {
		this.fild = fild;
		this.button = button;
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		warn();
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		warn();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		warn();
	}

	public void warn() {
//TODO
//		if ((fild.getText().length()) <= 0) {
//			button.setEnabled(false);
//	
//		} else {
//			button.setEnabled(true);
//		}
	}

}
