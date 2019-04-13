import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator {
	JFrame frame = new JFrame();
	JPanel panel=new JPanel();
	JButton button= new JButton();
	JTextField field = new JTextField();
	JTextField field2 = new JTextField();
public static void main(String[] args) {
	
}
public void view() {
	frame.setVisible(true);
	button.setText("translate");
	panel.add(button);
	panel.add(field);
	panel.add(field2);
	frame.add(panel);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
}
