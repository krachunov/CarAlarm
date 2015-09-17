package userInterface;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

public class ClickListener implements MouseListener {
	
	private JTextField fild;
	
	public  ClickListener(JTextField fild) {
		this.fild=fild;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		emptyFeild(fild);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	public void emptyFeild(JTextField userField ){
		userField.setText("");
	}

}
