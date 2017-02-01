package grid.controller;

import grid.controller.GridController;

public class GridRunner
{
	public static void main (String [] args) 
	{
		GridController mySudokuController = new GridController();
		mySudokuController.start();
	}
}
