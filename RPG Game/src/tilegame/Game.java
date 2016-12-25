package tilegame;

import tilegame.display.Display;

public class Game {			//this class will start everything, run everything, and close it
	
	private Display display;	// creates an instance of our display class
	
	public int width, height;	// this is so this class has access to the width and high easily down below
	
	public Game(String title, int width, int height){				//the Game constructor
		
		this.width = width;	// this passes the width and high to the global, so display can see it
		this.height = height;
		
		
		display = new Display(title, width, height);				// the parameters are needed in Game because they are needed for Display()
																	// now when we create a new game class instance, it will automatically set a display for itself to have
		
	}

}
