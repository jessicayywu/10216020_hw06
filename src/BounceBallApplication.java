/** Name: Yen-Yi Wu
 *  ID: U10216020
 *  Ex.: Convert the program in 18.8 to an application
 *  Information:
 *  			Change the Bouncing Ball from an applet to an application which can be run standalone
 */
import javax.swing.*;

public class BounceBallApplication extends JFrame {
	public BounceBallApplication() {
		add(new BallControl());
	}
	
	public static void main(String[] args) {
		BounceBallApplication frame = new BounceBallApplication();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setTitle("BounceBallApp");
	    frame.setSize(400, 320);
	    frame.setVisible(true);
	}
}
