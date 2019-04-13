import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JButton button1=new JButton();
JButton button2=new JButton();
public static void main(String[] args) {
	ChuckleClicker a = new ChuckleClicker(); 
	a.makeButtons();
}
public void makeButtons() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	
	button1.setText("joke");
	button2.setText("punchline");
	

	panel.add(button1);
	panel.add(button2);
	frame.add(panel);
	button1.addActionListener(this);
	button2.addActionListener(this);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (button1==e.getSource()) {
		JOptionPane.showMessageDialog(null, "A burglar stole my lamps");
		
	}
	if (button2==e.getSource()) {
		JOptionPane.showMessageDialog(null, "I should be upset, but I am delighted");
		
	}
	
}
}