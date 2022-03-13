import java.awt.event.*;
import javax.swing.*;

public class Drum2 implements ActionListener {
	
	private JButton D1;
	private JButton D2;
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	

	public Drum2() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		

		JButton D1 = new JButton("D1");
		JButton D2 = new JButton("D2");

		D1.addActionListener(this);
		D2.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource() == D1){
			label.setText("RAT");
			Timer timer1 = new Timer(500, label.setText(" "));
                        timer.setRepeats(false);
                        timer.start();

		}
		if (e.getSource() == D2){
			label.setText("tat");
			Timer timer1 = new Timer(500, label.setText(" "));
                        timer.setRepeats(false);
                        timer.start();

		}
	}
	
	public void go(){
		panel.add(label);
		panel.add(D1);
		panel.add(D2);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		Drum2 d = new Drum2();
		d.go();
	}
}


