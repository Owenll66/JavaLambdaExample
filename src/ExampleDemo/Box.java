package ExampleDemo;

public class Box {
	private String name;
	private int length;
	private int width;
	private int height;
	
	Box(String name, int length, int width, int height)
	{
		this.name = name;
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String toString() 
	{
		return "Box: [" + name + " " + String.valueOf(length) + " " + String.valueOf(width) + " " + String.valueOf(height) +"]";
	}
}
