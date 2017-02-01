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
	
	public Number[][] getGrid()
	{
		return grid;
	}
}
