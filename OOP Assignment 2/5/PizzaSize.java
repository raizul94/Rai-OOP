import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PizzaSize extends JPanel{
	public final double SMALL =6.00;
	public final double MEDIUM = 15.9;
	public final double LARGE  =18.9;
	
	private JRadioButton small;
	private JRadioButton medium;
	private JRadioButton large;
	private ButtonGroup bg;
	
	public PizzaSize()
	{
		small =new JRadioButton("Small Size RM 6.90");
		medium =new JRadioButton("Regular Size RM 15.90");
		large =new JRadioButton("Small Size RM 18.90");
		
		bg=new ButtonGroup(); // to make sure only one can be clicked at a time
		bg.add(small);
		bg.add(medium);
		bg.add(large);
		
		setBorder(BorderFactory.createTitledBorder("Pizza Size"));
		add(small);
		add(medium);
		add(large);
	}
	public double getPizzaSize()
	   {
	      double totalPizza = 0.0;

	      if (small.isSelected())
	    	  totalPizza = SMALL;
	      else if (medium.isSelected())
	    	  totalPizza = MEDIUM;
	      else if (large.isSelected())
	    	  totalPizza = LARGE;
	      ;

	      return totalPizza;
	   }

}
