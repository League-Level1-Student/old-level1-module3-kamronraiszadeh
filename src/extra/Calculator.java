package extra;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {

 double add(double num1,double num2){
	double answer= num1+num2;
	
	return answer;
}
 double subtract(double num1,double num2) {
	double answer2= num1-num2;
	 
	 return answer2;
}
 double multiply(double num1,double num2) {
	double answer3= num1*num2;
	 
	 return answer3;
}
 double divide(double num1,double num2) {
	
	 double answer4= num1/num2;
	 return answer4;
}
 public void view() {
	JFrame frame=new JFrame();
	JButton button= new JButton();
	JButton button2= new JButton();
	JButton button3= new JButton();
	JButton button4= new JButton();
	JTextField field=new JTextField(15);
	JTextField field2=new JTextField(15);
	JPanel panel = new JPanel();
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
	//panel.add(field);
	//panel.add(field);
	frame.add(panel);
	frame.pack();
 }
}
