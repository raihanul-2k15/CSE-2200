
public class Cube extends Shape3D {
	public float sideLength;
	
	public Cube(float len) {
		sideLength=len;
	}
	
	@Override
	public float getVolume() {
		return sideLength*sideLength*sideLength;
	}
	
	@Override
	public String getType() {
		return "Cube";
	}
}
