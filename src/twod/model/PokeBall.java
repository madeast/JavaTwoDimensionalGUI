package twod.model;

import java.awt.Color;

public class PokeBall
{
	private int numberofPokeBalls;
	private Color pokeBallColor;
	
	public PokeBall()
	{
		this.numberofPokeBalls = 1;
		this.pokeBallColor = Color.RED;
	}
	
	public PokeBall(int numberofPokeBalls, Color pokeBallColor)
	{
		
	}

	public int getNumberofPokeballs()
	{
		return numberofPokeBalls;
	}

	public void setNumberofPokeballs(int numberofPokeballs)
	{
		this.numberofPokeBalls = numberofPokeballs;
	}

	public Color getPokeBallColor()
	{
		return pokeBallColor;
	}

	public void setPokeBallColor(Color pokeBallColor)
	{
		this.pokeBallColor = pokeBallColor;
	}
	
	public String toString()
	{
		String pokeBallDescription = "This trainer has " + numberofPokeBalls 
				+ " pokeBalls and all their pokeBalls are " + pokeBallColor;
		
		return pokeBallDescription;
	}
}
