import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome extends JPanel{
	private JLabel greeting;
	
	public Welcome()
	{
		greeting = new JLabel("Welcome to Little Pizza Restoronto");
		add(greeting);
	}

}
