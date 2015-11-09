package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import gui.controller.GUIController;

/**
 * 
 * @author Rory Baker
 * @version 0.2 Nov 9, 2015 Added setupPanel Helper method.
 */
public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;

	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Do not click the button");
		firstTextField = new JTextField("you can type words here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	/**
	 * Loads content into the panel
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}

	/**
	 * Specifies the location of elements on the panel
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -63, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -26, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 44, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 137, SpringLayout.WEST, this);
	}

	/**
	 * Sets up the listeners for any buttons
	 */
	private void setupListeners()
	{

	}
}
