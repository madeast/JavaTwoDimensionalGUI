package twod.view;

import javax.swing.JFrame;
import twod.controller.TwoDController;

public class TwoDFrame extends JFrame
{
	private TwoDController baseController;
	private TwoDPanel basePanel;
	
	public TwoDFrame(TwoDController baseController)
	{
		this.baseController = baseController;
		basePanel = new TwoDPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500, 500);
		this.setContentPane(basePanel);
		this.setTitle("My 2D project");
		this.setVisible(true);
	}
}
