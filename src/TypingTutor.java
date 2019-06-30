import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;

	public static void main(String[] args) {
		TypingTutor type = new TypingTutor();
		type.view();

	}

	public void view() {

		frame.setVisible(true);

		frame.setTitle("TYPE NOW");
		frame.setSize(350, 350);

		frame.add(label);
		frame.setDefaultCloseOperation(3);
		currentLetter = generateRandomLetter();
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(currentLetter + "");

		frame.addKeyListener(this);
		frame.pack();
	}

	JFrame frame = new JFrame();
	JLabel label = new JLabel();

	static char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	

	@Override
	public void keyTyped(KeyEvent e) {

		// label.setText(currentLetter + "");
	}
	Date timeAtStart = new Date();

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	      Date timeAtEnd = new Date();
	      long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	      long gameInSeconds = (gameDuration / 1000) % 60;
	      double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	      int charactersPerMinute = (int) (charactersPerSecond * 60);
	      JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}
	@Override
	public void keyPressed(KeyEvent e) {

		System.out.println("you typed " + e.getKeyChar() + "");
		System.out.println("current letter is " + currentLetter);
		if (currentLetter == e.getKeyChar()) {
			frame.setBackground(Color.GREEN);
			label.setBackground(Color.GREEN);
			System.out.println("correct");
		} else {
			frame.setBackground(Color.RED);

		}
		frame.pack();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}
