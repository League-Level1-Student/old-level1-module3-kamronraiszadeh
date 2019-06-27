import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;

	public static void main(String[] args) {
		TypingTutor type = new TypingTutor();
		type.view();

	}

	public void view() {

		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.setTitle("TYPE NOW");
		frame.setSize(350, 350);
		frame.add(panel);
		frame.setDefaultCloseOperation(3);
		currentLetter = generateRandomLetter();

		label.setText(currentLetter + "");

		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
	}

	JFrame frame = new JFrame();
	JLabel label = new JLabel();

	static char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {

		label.setText(currentLetter + "");
	}

	@Override
	public void keyPressed(KeyEvent e) {

		System.out.println("you typed " +currentLetter+ "");

		if (currentLetter == e.getKeyChar()) {
			frame.setBackground(Color.GREEN);
		} else {
			frame.setBackground(Color.RED);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
