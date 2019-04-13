package extra;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SlotMachine {
	JFrame frame = new JFrame ();
	JPanel panel = new JPanel();
	JButton button = new JButton();
public static void main(String[] args) {
	SlotMachine slot = new SlotMachine();
	slot.view();
}
public void view() {
	frame.setVisible(true);
	button.setText("Spin");
	panel.add(button);
	frame.add(panel);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
