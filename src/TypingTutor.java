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
		type.Type();
	}

	public void Type() {
		// JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.setTitle("TYPE NOW");
		frame.setSize(500, 500);
		frame.add(panel);

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
		// TODO Auto-generated method stub
		label.setText(currentLetter + "");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(currentLetter);

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
