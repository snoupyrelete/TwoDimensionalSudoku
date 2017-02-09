package grid.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import grid.model.*;
import grid.model.Number;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.*;

import grid.controller.GridController;

public class GridPanel extends JPanel
{
	private JTextField rowField;
	private JTextField colField;
	private JTextField inputField;
	private JLabel rowLabel;
	private JLabel colLabel;
	private JLabel inputLabel;
	private JButton submitButton;
	private JTable sudokuGrid;
	private JComboBox comboBox;
	private JScrollPane gridPane;
	
	private SpringLayout baseLayout;
	private GridController baseController;
	
	

	public GridPanel(GridController baseController)
	{
		super();
		
		this.rowField = new JTextField("rowField");
		this.colField = new JTextField("colField");
		this.inputField = new JTextField("inputField");
		this.rowLabel = new JLabel("rowLabel");
		this.colLabel = new JLabel("colLabel");
		this.inputLabel = new JLabel("inputLabel");
		this.submitButton = new JButton("Submit");
		this.sudokuGrid = new JTable();
		this.comboBox = new JComboBox(new String [] {"Puzzle 1","Puzzle 2"});


		
		this.baseLayout = new SpringLayout();
		this.baseController = baseController;
		
		setupTable();
		setupPanel();
		setupListeners();
		setupLayout();
		
	}
	
	private void setupTable()
	{
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String []{"one","two","three","four","five","six","seven","eight","nine"});
		sudokuGrid = new JTable();
		sudokuGrid.setModel(data);
		sudokuGrid.setRowHeight(30);
	
		
		gridPane = new JScrollPane();


		gridPane.setViewportView(sudokuGrid);
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setMinimumSize(new Dimension(900, 600));
		this.add(gridPane);

		this.add(rowField);
		this.add(colField);
		this.add(inputField);
		this.add(rowLabel);
		this.add(colLabel);
		this.add(inputLabel);
		this.add(submitButton);
		this.add(comboBox);
		


	
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				int row = Integer.parseInt(rowField.getText());
				int col = Integer.parseInt(colField.getText());
				
				baseController.getGrid()[row][col].setNumber(Integer.parseInt(inputField.getText()));
			}
		});
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
		sudokuGrid.setAutoCreateRowSorter(true);
		//sudokuGrid.setBorder(new TitledBorder(null, "Sudoku", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		baseLayout.putConstraint(SpringLayout.NORTH, comboBox, 1, SpringLayout.NORTH, submitButton);
		baseLayout.putConstraint(SpringLayout.WEST, comboBox, 0, SpringLayout.WEST, rowField);
		baseLayout.putConstraint(SpringLayout.EAST, comboBox, 202, SpringLayout.WEST, this);
		sudokuGrid.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		sudokuGrid.setCellSelectionEnabled(true);
		baseLayout.putConstraint(SpringLayout.NORTH, gridPane, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 250, SpringLayout.WEST, this);
	}
	
	public GridController getBaseController() {
		return baseController;
	}
}

