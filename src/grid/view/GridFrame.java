package grid.view;

import java.awt.Dimension;

import javax.swing.JFrame;

import grid.controller.GridController;
import grid.view.GridPanel;

public class GridFrame extends JFrame 
{
	private GridController baseController;

	private GridPanel sudokuPanel;

	public GridFrame(GridController baseController)
	{
		super();
		this.baseController = baseController;
		sudokuPanel = new GridPanel(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(sudokuPanel);
		this.setTitle("Sudoku Window");
		this.setSize(new Dimension(900, 600));
		this.setVisible(true);
	}
	
	public GridController getBaseController() {
		return baseController;
	}
	
	
}
