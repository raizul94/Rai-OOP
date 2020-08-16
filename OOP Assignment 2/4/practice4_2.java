import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class practice4_2 extends JPanel{
	
	private static JLabel label;
	public practice4_2()
	{
		label = new JLabel(" Use the menu to change my color and make me invisible");
		add(label);
	}
	
	public void getRed()
	{
		label.setForeground(Color.red);
	}
	public void getBlack()
	{
		label.setForeground(Color.black);
	}
	public void getBlue()
	{
		label.setForeground(Color.blue);
	}
	public void getInv()
	{
		label.setForeground(Color.yellow);
	}

}
