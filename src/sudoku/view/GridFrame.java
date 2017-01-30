package sudoku.view;

import java.awt.Dimension;

import javax.swing.JFrame;

import sudoku.controller.SudokuController;
import sudoku.view.GridPanel;

public class GridFrame extends JFrame 
{
	private SudokuController baseController;

	private GridPanel sudokuPanel;

	public GridFrame(SudokuController baseController)
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
}
