package twod.view;

import javax.swing.JPanel;
import twod.controller.TwoDController;

public class TwoDPanel extends JPanel
{
	private TwoDController baseController;
	
	public TwoDPanel(TwoDController baseController)
	{
		this.baseController = baseController;
	}

}
