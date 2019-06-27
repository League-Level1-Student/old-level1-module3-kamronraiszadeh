package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
		button.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button);
		panel.add(button2);
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(3);
	}

	JButton button = new JButton("joke");
	JButton button2 = new JButton("punchline");

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (button == e.getSource()) {
	 JOptionPane.showMessageDialog(null, "I ate a clock today");
		}
		else if (button2==e.getSource()) {
			JOptionPane.showMessageDialog(null, "It was very time consuming");
		}

	}
}
