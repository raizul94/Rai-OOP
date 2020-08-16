import javax.swing.*;
public class ShowWindowDemo3 {
	
	
	public static void main(String[] args) {
		
		String height1=JOptionPane.showInputDialog("Enter the width of the Window");
		String width1=JOptionPane.showInputDialog("Enter the height of Window");
		String title=JOptionPane.showInputDialog("Enter the title bro");

		int height=Integer.parseInt(height1);
		int width=Integer.parseInt(width1);
		
		JFrame frame= new JFrame(title);
		frame.setSize(height,width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
