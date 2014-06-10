import java.awt.*;
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
