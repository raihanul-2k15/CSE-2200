
public class Sphere extends Shape3D {
	public float radius;
	private static float PI = 3.14159f;
	
	public Sphere (float r) {
		this.radius=r;
	}
	
	@Override
	public float getVolume() {
		return (4.0f/3.0f)*PI*radius*radius*radius;
	}
	
	@Override
	public String getType() {
		return "Sphere";
	}
}
