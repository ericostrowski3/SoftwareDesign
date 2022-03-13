import javax.swing.*;
import java.awt.event.*;

class Action implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

public class Button {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Quit");
	
		button.addActionListener(new Action());

		panel.add(button);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
}
