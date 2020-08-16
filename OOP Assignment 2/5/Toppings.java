import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Toppings extends JPanel {
	public final double  TOMATO=1.50;
	public final double  BOLIVERS=2.0;
	public final double  CHEESE=2.50;
	public final double  GPEPPER=3.0;
	public final double  MUSHY= 3.50;
	
	private JCheckBox tomato;
	private JCheckBox boliver;
	private JCheckBox cheese;
	private JCheckBox gpepper;
	private JCheckBox mushy;

	
	public Toppings()
	{
		setLayout(new GridLayout(3, 2));
		tomato = new JCheckBox("Tomatoes");
		boliver = new JCheckBox("Black Olivers");
		gpepper = new JCheckBox("Green Pepper");
		mushy = new JCheckBox("Mushrooms");
		
	     setBorder(BorderFactory.createTitledBorder("Toppings"));

		
		add(tomato);
		add(boliver);
		add(gpepper);
		add(mushy);
	}
	
	public double getTopping()
	{
		double total=0;
		
		if(tomato.isSelected())
		{
			total+=TOMATO;
		}
		if(boliver.isSelected())
		{
			total+=BOLIVERS;
		}
		if(gpepper.isSelected())
		{
			total+=GPEPPER;
		}
		if(mushy.isSelected())
		{
			total+=MUSHY;
		}
		
		return total;
		
	}
	

}
