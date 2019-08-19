import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener  {
JFrame frame = new JFrame();
JPanel panel= new JPanel();
JButton button =new JButton();
JButton button2 = new JButton();
public static void main(String[] args) {
	ChuckleClicker cc = new ChuckleClicker();
	cc.makeButtons();
}
public void makeButtons() {
	frame.setVisible(true);
	button.setText("joke");
	button2.setText("punchline");
	button.addActionListener(this);
	button2.addActionListener(this);
	panel.add(button);
	panel.add(button2);
	frame.add(panel);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource()==button) {
		JOptionPane.showMessageDialog(null,"what do you call an overweight psychic");
	}
		if (e.getSource()==button2) {
			JOptionPane.showMessageDialog(null, "a four-chin teller ");
			
		
	}
}
		
	
	
}


