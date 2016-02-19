package twod.view;

import javax.swing.JFrame;
import twod.controller.TwoDController;

public class TwoDFrame extends JFrame
{
	private TwoDController baseController;
	
	public TwoDFrame(TwoDController baseController)
	{
		this.baseController = baseController;
	}
}
