import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

class Button1 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		


public class Drum implements ActionListener {
        private JFrame  frame;
        private JPanel  panel;
        private JLabel  tik;
        private JLabel  msRate;
        private JTextField	field;
        private Timer   timer;


        public Drum() {
                frame = new JFrame("Metronome");
                panel = new JPanel();
                timer = new Timer(1000, this);
                tik = new JLabel("TIK");
                msRate = new JLabel("Rate in milliseconds");
                field = new JTextField("1000", 4);
 	}

        public void actionPerformed(ActionEvent e) {
                if (tik.getText().equals("TIK")){
                        tik.setText("tok");
                }else{
                      	tik.setText("TIK");
                }
                String text = field.getText();
                int time = Integer.parseInt(text);
                timer.setDelay(time);
        }

        public void go(){
                panel.add(tik);
                panel.add(msRate);
                panel.add(field);
                frame.add(panel);
                frame.pack();
                frame.setVisible(true);
                timer.start();
        }

        public static void main(String[] args) {
                Metronome m = new Metronome();
                m.go();
        }
}
