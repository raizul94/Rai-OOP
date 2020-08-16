import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;


public class practice4 extends JMenu {
	private static JMenuBar menuBar;
	private static JMenu File;
	private static JMenu Text;
	private static JRadioButton black;
	private static JRadioButton red;
	private static JRadioButton blue;
	private static JCheckBox visible;
	private static JFrame frame;
	private practice4_2 panel;

	
	public practice4()
	{
		menuBar = new JMenuBar();
		File = new JMenu("File");
		Text = new JMenu("Text");
		
		
		black= new JRadioButton("Black");
		black.addActionListener(new ChangeColorListener());
		red= new JRadioButton("Red");
		red.addActionListener(new ChangeColorListener());
		blue= new JRadioButton("Blue");
		blue.addActionListener(new ChangeColorListener());
		visible = new JCheckBox("Visibility");
		visible.addActionListener(new ChangeVisible ());
		Text.add(black);
		Text.add(blue);
		Text.add(red);
		Text.add(visible);
		menuBar.add(File);
		menuBar.add(Text);
		
		frame = new JFrame(" new");
		frame.setSize(400,200);
		panel = new practice4_2();
		frame.add(menuBar , BorderLayout.NORTH);
		frame.add(panel,BorderLayout.WEST);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		


		
	}
	
	 private class ChangeColorListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  if(e.getSource().equals(black) )
	    	  {
	    		  panel.getBlack();
	    		
	    	  }
	    	  if(e.getSource().equals(blue) )
	    	  {
	    		  panel.getBlue();
	    	  }
	    	  if(e.getSource().equals(red) )
	    	  {
	    		  panel.getRed();
	    	  }
	    	  
	    	  
	        
	      }
	   }


	   private class ChangeVisible implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  if(visible.isSelected())
	          {
	        	  panel.setVisible(false);
	          }
	      }
	   }
	public static void main(String[] args)
	{
		new practice4();
	}
	
	
	
	
	
	
	

}
