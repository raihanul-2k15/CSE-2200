
public class Rectangle extends Quadrilateral {
	public float width;
	public float height;
	
	public Rectangle(float w, float h) {
		this.width = w;
		this.height = h;
	}
	
	@Override
	public float getArea() {
		return width * height;
	}
	
	@Override
	public String getType() {
		return "Rectangle";
	}
}
