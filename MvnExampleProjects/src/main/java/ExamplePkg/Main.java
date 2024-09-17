package ExamplePkg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Rectangle rectangle = new Rectangle(10, 12);
		  
		  System.out.println(rectangle.getArea());
		  
		  Circle c=new Circle(5);
		  System.out.println(c.getArea());
		  
		  Triangle tri=new Triangle(5,5);
		  System.out.println(tri.getArea());
	}

}
