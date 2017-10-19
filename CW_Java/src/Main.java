
public class Main {

	public static void main(String[] args) {
		Cube c=new Cube(3f);
		RightTriangle rt=new RightTriangle(2f, 3f);
		Sphere sp=new Sphere(4f);
		Rectangle r=new Rectangle(4f,5f);
		Square sq=new Square(5f);
		try {
			mass_process(r,c,rt,sp,sq);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void do_something(Shape s) {
		System.out.println("The object is of type "+s.getType()+" and area "+s.getArea());
	}
	
	public static void mass_process(Object ...shapes) {
		for (Object s : shapes) {
			if (s instanceof Shape2D) {
				Shape sp=(Shape)s;
				System.out.println("The Shape is of type "+sp.getType()+" and area "+sp.getArea());
			} else if (s instanceof Shape3D) {
				Shape sp = (Shape) s;
				System.out.println("The Shape is of type "+sp.getType()+" and volume "+sp.getVolume());
			}
		}
	}
}
