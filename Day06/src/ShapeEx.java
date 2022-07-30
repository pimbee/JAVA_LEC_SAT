
public class ShapeEx {
	public static void main(String args[]) {
		Shape shape[] = new Shape[4];
		shape[0] = new Circle(10);
		shape[1] = new Rectangle(5, 5);
		shape[2] = new Circle(20);
		shape[3] = new Rectangle(10, 10);
		
		for(Shape s : shape) {
			System.out.println(s.type + "=======");
			System.out.println("넓이 " + s.area());
			System.out.println("둘레 " + s.length());
		}
		
		
	}
}
