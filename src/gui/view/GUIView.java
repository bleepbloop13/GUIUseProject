package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;
/**
 * Creates the frame for the GUI project
 * @author Rory Baker
 * @version 0.2 Nov 9, 2015 Added the setupFrame helper method.
 */
public class GUIView extends JFrame
{
	private GUIController baseController;
	
	public GUIView(GUIController baseController)
	{
		this.baseController = baseController;
		setupFrame();
	}
	
	private void setupFrame()
	{
		
		this.setVisible(true); // Always must be the last line of code in setupFrame method.
	}
}
