package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	public static void main(String[] args) {
	NastySurprise masty= new NastySurprise();
	masty.setup();
		
	}
	public void setup () {

	
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.add(b);
		panel.add(bc);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		b.addActionListener(this);
		bc.addActionListener(this);        
	}
	JButton b = new JButton("Trick");
	JButton bc = new JButton("Treat");

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
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
 
 JButton button=(JButton) e.getSource();
 if (button==b) {
	 showPictureFromTheInternet("https://groomarts.com/assets/images/_listItem/cute-puppy-2.jpg"); 
	

}
 else {
	 showPictureFromTheInternet("http://www.empireonline.it/wp-content/uploads/2017/06/it-3.jpg");
 }
}
}
