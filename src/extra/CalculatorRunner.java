package extra;

public class CalculatorRunner {
public static void main(String[] args) {
	Calculator cal = new Calculator();
 double answer= cal.add (6.0,7.0);
System.out.println(answer);

double answer2=cal.subtract(10.0, 7.0);
System.out.println(answer2);

double answer3=cal.multiply(9.0,7.0);
System.out.println(answer3);

double answer4=cal.divide(10.0, 10.0);
System.out.println(answer4);

cal.view();

}
}
