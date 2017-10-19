
public class RightTriangle extends Triangle {
	public float base;
	public float height;
	public RightTriangle(float b, float h) {
		this.base=b;
		this.height=h;
	}
	
	@Override
	public float getArea() {
		return 0.5f * base * height;
	}
	
	@Override
	public String getType() {
		return "Right Triangle";
	}
}
