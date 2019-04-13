package extra;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements MouseListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JTextField field = new JTextField(11);
	JTextField field2 = new JTextField(11);
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	double add(double num1, double num2) {
		double answer = num1 + num2;

		return answer;
	}

	double subtract(double num1, double num2) {
		double answer2 = num1 - num2;

		return answer2;
	}

	double multiply(double num1, double num2) {
		double answer3 = num1 * num2;

		return answer3;
	}

	double divide(double num1, double num2) {

		double answer4 = num1 / num2;
		return answer4;
	}

	public void view() {

		frame.setVisible(true);
		button.setText("add");
		button2.setText("sub");
		button3.setText("mult");
		button4.setText("div");
		panel.add(field);
		panel.add(field2);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);
		panel.setPreferredSize(new Dimension(340, 100));
		frame.setTitle("Calculator");
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addMouseListener(this);
		button2.addMouseListener(this);
		button3.addMouseListener(this);
		button4.addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		double num1 = 0;
		double num2 = 0;
		num1 = Double.parseDouble(field.getText());
		num2 = Double.parseDouble(field2.getText());
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if (button == pressed) {
			double answer = add(num1, num2);

			label.setText(answer + "");
			frame.pack();
		}
		if (button2 == pressed) {
			double answer = subtract(num1, num2);

			label.setText(answer + "");
			frame.pack();
		}
		if (button3 == pressed) {
			double answer = multiply(num1, num2);

			label.setText(answer + "");
			frame.pack();
		}
		if (button4 == pressed) {
			double answer = divide(num1, num2);

			label.setText(answer + "");
			frame.pack();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
