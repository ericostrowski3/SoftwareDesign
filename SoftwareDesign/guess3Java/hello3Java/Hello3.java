import javax.swing.*;

class Hello3 {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Widgets");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Hello, GUI world!");

		frame.add(panel);
		
		panel.add(label);

		frame.pack();
		frame.setVisible(true);
	}
}
