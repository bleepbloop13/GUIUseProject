package gui.controller;

import gui.view.GUIView;

/**
 * Controller for the GUI project.
 * 
 * @author Rory Baker
 * @version 0.1 Nov 9, 2015
 */
public class GUIController
{
	/**
	 * Reference to the GUIView object of the view.
	 */
	private GUIView simpleFrame;

	public GUIController()
	{
		simpleFrame = new GUIView(this);
	}

	public void start()
	{
	}
}
