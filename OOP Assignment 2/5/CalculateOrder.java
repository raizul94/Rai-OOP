import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CalculateOrder extends JFrame {
	private Welcome welcome;
	private PizzaSize size;
	private Toppings topping;
	
	private JButton calculate;
	private JButton exit;
	private JPanel buttonpanel;
	
	public CalculateOrder()
	{
		
		setTitle(" Pizza Order Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setLayout(new BorderLayout());
		
		welcome = new Welcome();
		size = new PizzaSize();
		topping = new Toppings();
		
		buildButtonPanel();
		
		  add(welcome, BorderLayout.NORTH);
	      add(topping, BorderLayout.WEST);
	      add(size, BorderLayout.CENTER);
	      add(buttonpanel,BorderLayout.SOUTH);
	      
	      pack();
	      setVisible(true);
		
	}
	
	private void buildButtonPanel()
	{
		buttonpanel = new JPanel();
		calculate = new JButton("Calculate");
		exit=new JButton("Exit");
		
		calculate.addActionListener(new ActionListen ());
		exit.addActionListener(new ExitListen());
		
		buttonpanel.add(calculate);
		buttonpanel.add(exit);
		
	}
	
	private class ActionListen implements ActionListener
	{
		public void actionPerformed ( ActionEvent e)
		{
			double subtotal=0;
			
			subtotal =size.getPizzaSize()+topping.getTopping();
			JOptionPane.showMessageDialog(null, "The subtotal is : $" + subtotal);
			
		}
	}
	private class ExitListen implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			System.exit(0);
		}
	}
	
	public static void main(String [] args)
	{
		new CalculateOrder();
	}
	

}
