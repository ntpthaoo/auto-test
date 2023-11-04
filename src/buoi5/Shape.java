package buoi5;

public abstract class Shape {
	private String color = "red";

	public String getColor() {
		return color;
	}
	public void setColor(String newColor) {
		this.color = newColor;
	}

	public abstract void draw() ;
		
	
	
}
