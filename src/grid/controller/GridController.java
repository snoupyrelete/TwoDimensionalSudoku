package grid.controller;

import grid.view.GridFrame;

import grid.model.Number;

public class GridController 
{
	
	private Number[][] grid;
	private GridFrame sudokuFrame;
	
	public GridController()
	{
		grid = new Number[9][9];
		grid[0][0] = new Number(3);
		grid[1][1] = new Number(7);
		sudokuFrame = new GridFrame(this);
		
	}
	
	public void start()
	{
		
	}
	
	private void fillGrid()
	{
		for (int row = 0; row < grid.length; row++)
		{
			for (int col = 0; col < grid[0].length; col++)
			{
				grid[row][col] = new Number(1);
			}
		}
	}
	
	public Number[][] getGrid()
	{
		return grid;
	}
}
