package twod.controller;

import java.awt.Color;

import twod.model.PokeBall;
import twod.view.TwoDFrame;

public class TwoDController
{
	private TwoDFrame baseFrame;
	private PokeBall [][] myPokeBalls;
	
	public TwoDController()
	{
		myPokeBalls = new PokeBall [3][3];
		setupArray();
		baseFrame = new TwoDFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void setupArray()
	{
		for(int row = 0; row < myPokeBalls.length; row++)
		{
			for(int col = 0; col < myPokeBalls[0].length; col++)
			{
				myPokeBalls[row][col] = new PokeBall();
				if(col % 2 == 0)
				{
					myPokeBalls[row][col].setNumberofPokeballs(col + 5);
				}
				else
				{
					myPokeBalls[row][col].setPokeBallColor(Color.CYAN);
				}
			}
		}
	}

	public PokeBall[][] getTrainerPokeBalls()
	{
		return myPokeBalls;
	}
}
