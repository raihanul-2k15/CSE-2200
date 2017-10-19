
public class Square extends Quadrilateral {
	public float sideLength;
	
	public Square(float len) {
		this.sideLength = len;
	}
	
	@Override
	public float getArea() {
		return sideLength * sideLength;
	}
	
	@Override
	public String getType() {
		return "Square";
	}
}
