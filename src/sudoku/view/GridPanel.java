package sudoku.view;

import java.awt.Dimension;

import javax.swing.*;
import sudoku.controller.SudokuController;

public class GridPanel extends JPanel
{
	private JTextField rowField;
	private JTextField colField;
	private JTextField inputField;
	private JLabel rowLabel;
	private JLabel colLabel;
	private JLabel inputLabel;
	private JButton submitButton;
	private SpringLayout baseLayout;
	private SudokuController baseController;
	
	public GridPanel(SudokuController baseController)
	{
		super();
		
		this.rowField = new JTextField("rowField");
		this.colField = new JTextField("colField");
		this.inputField = new JTextField("inputField");
		this.rowLabel = new JLabel("rowLabel");
		this.colLabel = new JLabel("colLabel");
		this.inputLabel = new JLabel("inputLabel");
		this.submitButton = new JButton("Submit");
		this.baseLayout = new SpringLayout();
		
		this.baseController = baseController;
		
		setupPanel();
		setupListeners();
		setupLayout();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.add(rowField);
		this.add(colField);
		this.add(inputField);
		this.add(rowLabel);
		this.add(colLabel);
		this.add(inputLabel);
		this.add(submitButton);
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, rowLabel, -16, SpringLayout.NORTH, colLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, colField, -6, SpringLayout.NORTH, inputField);
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, -5, SpringLayout.NORTH, rowLabel);
		baseLayout.putConstraint(SpringLayout.EAST, rowField, 0, SpringLayout.EAST, colField);
		baseLayout.putConstraint(SpringLayout.NORTH, inputLabel, 432, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, colField, 0, SpringLayout.EAST, inputField);
		baseLayout.putConstraint(SpringLayout.SOUTH, colLabel, -16, SpringLayout.NORTH, inputLabel);
		baseLayout.putConstraint(SpringLayout.WEST, colLabel, 0, SpringLayout.WEST, rowLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 427, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 8, SpringLayout.EAST, inputLabel);
		baseLayout.putConstraint(SpringLayout.WEST, inputLabel, 0, SpringLayout.WEST, rowLabel);
		baseLayout.putConstraint(SpringLayout.WEST, rowLabel, 30, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 6, SpringLayout.SOUTH, inputField);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 24, SpringLayout.WEST, this);
	}
}
