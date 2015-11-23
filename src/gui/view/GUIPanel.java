package gui.view;

import javax.swing.*;
import gui.controller.GUIController;
import java.awt.event.*;
import java.awt.Color;

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
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("YOU CLICKED THE BUTTON YOU WHORE!");
			}
		});

		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent clicked)
			{
				
			}

			public void mouseReleased(MouseEvent released)
			{
				changeRandomColor();
			}

			public void mousePressed(MouseEvent pressed)
			{
				changeRandomColor();
			}

			public void mouseEntered(MouseEvent entered)
			{
				changeRandomColor();
			}

			public void mouseExited(MouseEvent exited)
			{
				changeRandomColor();
			}

		});
	}

	private void changeRandomColor()
	{
		int red, green, blue;

		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);

		this.setBackground(new Color(red, green, blue));
	}

}
