package ExamplePkg;

public class Circle implements Shape {

	private double rad;
	public Circle(double rad)
	{
		this.rad=rad;
	}
	

public double getArea()
{
return 3.14*rad*rad;

}
}
