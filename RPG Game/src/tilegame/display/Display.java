package tilegame.display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
	
	private JFrame frame;				// creates the JFrame object, not initialized yet
	private Canvas canvas;				// used to get images into the JFrame, allows us to draw graphics to it, like a canvas
										// we will then add the canvas element to the JFrame
										// like putting a canvas in a frame
	private String title;				// variables for the windows title
	private int width, height;			// variable for the windows dimensions
	
	public Display(String title, int width, int height){		// this is the constructor of the display class
		this.title = title;										// this is using this.title instead of just title
		this.width = width;										// because the class variables are the same as the
		this.height = height;									// parameters
		
		createDisplay();										// calls the display method once constructing the variables
		
	}
	
	private void createDisplay(){								// create display method
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// this makes it so the program terminates when the window is closed
		frame.setResizable(false);								// The ability to drag the window to resize it
		frame.setLocationRelativeTo(null);						// This makes the window appear in the center of screen, not side
		frame.setVisible(true);									// !!! must have this, JFrame by default are invisible
		
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));  // uses a new Dimension object to set the size of our canvas, we set to the same size as the frame
		canvas.setMaximumSize(new Dimension(width, height));    // this makes sure it stays at the size we want
		canvas.setMinimumSize(new Dimension(width, height));  
		
		frame.add(canvas);										// adds the canvas to our JFrame
		frame.pack();											// resizes our window slightly so make sure we fully see canvas(no cut offs)

			}

}