import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Practice2 implements ActionListener{
	private	static JFrame frame;
	private static JPanel panel;
	private static JButton Red;
	private static JButton Blue;
	private static JButton Yellow;
	private static JLabel label;
	
	
	
	public static void main(String[] args) {
		 frame = new JFrame("colors");
		frame.setSize(250,150);
		 panel= new JPanel();
		panel.setLayout(null);
		
		label = new JLabel("Click a button to select a color");
		label.setBounds(10, 15, 200, 25);
		panel.add(label);

		 Red = new JButton("Red");
		Red.setBounds(20, 40 , 80, 25);
		Red.addActionListener(new Practice2 ());
		panel.add(Red);
		
		 Blue = new JButton("Blue");
		Blue.setBounds(100, 40 , 80, 25);
		Blue.addActionListener(new Practice2 ());
		panel.add(Blue);
		
		 Yellow = new JButton("Yellow");
		Yellow.setBounds(60, 70 , 80, 25);
		Yellow.addActionListener(new Practice2 ());
		panel.add(Yellow);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==Red)
		{
			panel.setBackground(Color.red);
			label.setForeground(Color.blue);
		}
		else if (e.getSource()== Blue)
		{
			panel.setBackground(Color.BLUE);
			label.setForeground(Color.yellow);
		}
		else if (e.getSource()== Yellow)
		{
			panel.setBackground(Color.YELLOW);
			label.setForeground(Color.black);	
		}
		
	}

}
