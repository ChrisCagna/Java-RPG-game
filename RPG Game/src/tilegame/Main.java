package tilegame;

public class Main {
	public static void main(String[] args){
	//	new Display("Commit",600,600);				//calls the display constructor - creates a new Display object
		new Game("Commit",600,600);		// here we now use the Game method to call the window, which calls the display class
	}
}