package twod.controller;

import java.awt.Color;

import twod.model.PokeBall;
import twod.view.TwoDFrame;

public class TwoDController
{
	private TwoDFrame baseFrame;
	private Pokeball [][] myPokeBalls;
	
	public TwoDController()
	{
		myPokeBalls = new PokeBall [3][3];
		baseFrame = new TwoDFrame(this);
	}
	
	public void start()
	{
		setupArray();
	}
	
	private void setupArray()
	{
		for(int row = 0; row < myPokeBalls.length; row++)
		{
			for(int col = 0; col < trainerPokeballs[0].length; col++)
			{
				myPokeBalls[row][col] = new trainerPokeBalls();
				if(col % 2 == 0)
				{
					myPokeBalls[row][col].setNumberOfPokeBalls(col + 5);
				}
				else
				{
					myPokeBalls[row][col].setPokeBallColor(Color.CYAN);
				}
			}
		}
	}

	public Pokeballs[][] getTrainerPokeBalls()
	{
		return trainerPokeballs;
	}
}
