package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

/**
 * Creates the frame for the GUI project
 * 
 * @author Rory Baker
 * @version 0.3 Nov 9, 2015 Added a reference to the GUIPanel and installed it as the content pane.
 */
public class GUIView extends JFrame
{
	private GUIController baseController;
	private GUIPanel basePanel;

	public GUIView(GUIController baseController)
	{
		this.baseController = baseController; // Assign parameter to data member.
		basePanel = new GUIPanel(baseController); // Creates an instance of the GUIPanel with a reference to the controller.
		setupFrame();
	}
	/**
	 * Helper method to setup the Frame and its structure.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel); // Sets the panel in the GUIFrame, this is REQUIRED!!!
		this.setResizable(false); // Usually a good idea, but not required.
		this.setSize(400, 400); // Sets the size.
		this.setVisible(true); // Always must be the last line of code in setupFrame method.
	}
}
