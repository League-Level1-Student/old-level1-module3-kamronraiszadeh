package extra;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise {
	public static void main(String[] args) {
		JButton b = new JButton("Trick");
		JButton bc = new JButton("Treat");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.add(b);
		panel.add(bc);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		b.addActionListener(null);
		
	}

private void showPictureFromTheInternet(String imageUrl) {
     try {
          URL url = new URL(imageUrl);
          Icon icon = new ImageIcon(url);
          JLabel imageLabel = new JLabel(icon);
          JFrame frame = new JFrame();
          frame.add(imageLabel);
          frame.setVisible(true);
          frame.pack();
     } catch (MalformedURLException e) {
          e.printStackTrace();
     }
}
}
