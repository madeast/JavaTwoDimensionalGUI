package twod.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import twod.controller.TwoDController;

public class TwoDPanel extends JPanel
{
	private TwoDController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentPokeBalls;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	private JTable pokeBallTable;
	
	public TwoDPanel(TwoDController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		rowField = new JTextField(5);
		columnField = new JTextField(5);
		
		editField = new JTextField(20);
		
		currentPokeBalls = new JLabel("the current PokeBalls");
		
		changeButton = new JButton("Change the indicate PokeBalls");
		
		displayButton = new JButton("Display the indicated PokeBalls");
		
		
		setupTable();
		setupPanel();
		setupLayout();
	}
	/**
	 * Helper method to load information from the model into the GUI as a 2D array.
	 */

	private void setupTable()
	{
		String [] columnHeaders = {"Column 1", "Column 2", "Column 3"};
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getTrainerPokeBalls(), columnHeaders);
		pokeBallTable = new JTable(tableModel);
		baseLayout.putConstraint(SpringLayout.NORTH, pokeBallTable, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokeBallTable, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokeBallTable, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, pokeBallTable, -50, SpringLayout.EAST, this);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 0, SpringLayout.NORTH, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 21, SpringLayout.EAST, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, columnField, -67, SpringLayout.NORTH, editField);
		baseLayout.putConstraint(SpringLayout.WEST, editField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, editField, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, currentPokeBalls, 0, SpringLayout.WEST, columnField);
		baseLayout.putConstraint(SpringLayout.NORTH, changeButton, 1, SpringLayout.NORTH, columnField);
		baseLayout.putConstraint(SpringLayout.EAST, changeButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, currentPokeBalls, 5, SpringLayout.NORTH, displayButton);
		baseLayout.putConstraint(SpringLayout.NORTH, displayButton, 15, SpringLayout.SOUTH, changeButton);
		baseLayout.putConstraint(SpringLayout.WEST, displayButton, 0, SpringLayout.WEST, changeButton);
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(pokeBallTable);
		this.add(currentPokeBalls);
		this.add(columnField);
		this.add(rowField);
		this.add(currentPokeBalls);
		this.add(editField);
		this.add(changeButton);
		this.add(displayButton);
		
	}

}
