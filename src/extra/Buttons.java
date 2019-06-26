package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttons implements ActionListener {
public static void main(String[] args) {
	Buttons b = new Buttons();
	b.view();
}
public void view() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	JButton button = new JButton("joke");
	JButton button2 = new JButton("punchline");
	button.addActionListener(this);
	button2.addActionListener(this);
	panel.add(button);
	panel.add(button2);
	frame.add(panel);
	frame.pack();
	frame.setDefaultCloseOperation(3);
}
@Override
public void actionPerformed(ActionEvent e) {
	
	
}
}
