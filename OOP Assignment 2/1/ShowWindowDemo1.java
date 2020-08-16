import javax.swing.JFrame;

public class ShowWindowDemo1 {
	public static void main(String[] args) {
		
		ShowWindow window1= new ShowWindow (400, 100);
		window1.setTitle("KS20603 Lab Excercise 6 Practice 1 Demo 1");
		JFrame frame = new JFrame(window1.getTitle());
		frame.setSize(window1.getLength(),window1.getWidth());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
