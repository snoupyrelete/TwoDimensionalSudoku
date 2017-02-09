package grid.controller;

import grid.view.GridFrame;

import grid.model.Number;

public class GridController 
{
	
	private Number[][] grid;
	private GridFrame sudokuFrame;
	
	public GridFrame getFrame()
	{
		return sudokuFrame;
	}

	//	https://www.sciencenews.org/article/sudoku-solution
	public GridController()
	{
		grid = new Number[9][9];
		grid[0] = new Number [] {new Number(0),new Number(7),new Number(5),new Number(0),new Number(9),new Number(0),new Number(0),new Number(0),new Number(6)};
		grid[1] = new Number [] {new Number(0),new Number(2),new Number(3),new Number(0),new Number(8),new Number(0),new Number(0),new Number(4),new Number(0)};
		grid[2] = new Number [] {new Number(8),new Number(0),new Number(0),new Number(0),new Number(0),new Number(3),new Number(0),new Number(0),new Number(1)};
		grid[3] = new Number [] {new Number(5),new Number(0),new Number(0),new Number(7),new Number(0),new Number(2),new Number(0),new Number(0),new Number(0)};
		grid[4] = new Number [] {new Number(0),new Number(4),new Number(0),new Number(8),new Number(0),new Number(6),new Number(0),new Number(2),new Number(0)};
		grid[5] = new Number [] {new Number(0),new Number(0),new Number(0),new Number(9),new Number(0),new Number(1),new Number(0),new Number(0),new Number(3)};
		grid[6] = new Number [] {new Number(9),new Number(0),new Number(0),new Number(4),new Number(0),new Number(0),new Number(0),new Number(0),new Number(7)};
		grid[7] = new Number [] {new Number(0),new Number(6),new Number(0),new Number(0),new Number(7),new Number(0),new Number(5),new Number(8),new Number(0)};
		grid[8] = new Number [] {new Number(7),new Number(0),new Number(0),new Number(0),new Number(1),new Number(0),new Number(3),new Number(9),new Number(0)};
		
		
		//		grid[0][0] = new Number(3);
//		grid[1][1] = new Number(7);
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
