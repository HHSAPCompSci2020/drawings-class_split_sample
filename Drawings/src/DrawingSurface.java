import processing.core.PApplet;

public class DrawingSurface extends PApplet {

	// FIELDS
	private House h;
	
	
	// CONSTRUCTOR - Initialize any added fields here.
	public DrawingSurface() {
		h = new House();
	}
	
	
	// METHODS
	// Add processing methods here. See the documentation at processing.org for reference.
	
	// The setup method is a lot like a constructor - it runs just once at the beginning.
	// The big difference is that most processing libary methods don't work in the constructor. So, if you need to
	// do some processing-related action just once at the beginning, do it here.
	public void setup() {
		
	}
	
	public void draw() {
		h.draw(this);
	}
	
	// Add methods for user interaction. Check the processing reference for info on this (http://processing.org).
	// We'll also review how to get mouse/keys working in class.
	
	
	
}
