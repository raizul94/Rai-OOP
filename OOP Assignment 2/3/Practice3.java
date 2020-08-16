import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.*;

public class Practice3 implements ActionListener {
	private static JFrame frame;
	private static JButton button1;
	private static JButton button2;
	private static JButton button3;
	private static JPanel panel;
	
	public static void main(String[] args) {
		frame = new JFrame("Event Object Demostration");
		frame.setSize(300,100);
		panel = new JPanel();
		
		
		button1 = new JButton ("Button 1");
		button1.setBounds(20, 40 , 80, 25);
		button1.addActionListener(new Practice3 ());
		button2 = new JButton ("Button 2");
		button2.setBounds(100, 40 , 80, 25);
		button2.addActionListener(new Practice3 ());
		button3 = new JButton ("Button 3");
		button3.setBounds(180, 40 , 80, 25);
		button3.addActionListener(new Practice3 ());
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1)
		{
			JOptionPane.showMessageDialog(null,"you clicked button 1");
		}
		else if(e.getSource() == button2)
		{
			JOptionPane.showMessageDialog(null,"you clicked button 2");


		}
		else if(e.getSource() == button3)
		{
			JOptionPane.showMessageDialog(null,"you clicked button 3");


		}
			
		
	}
	

}
