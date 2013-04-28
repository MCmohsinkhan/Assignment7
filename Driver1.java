import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Driver1 extends JFrame {

  public static void main (String[] args) {
		//JFrame frame = new JFrame("Bank Account");
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GUI panel = new GUI();
		//frame.getContentPane().add(panel);

		panel.pack();
		panel.setSize(270, 250);
		panel.setVisible(true);
	}

}

