package ExamplePkg;

public class Triangle implements Shape{

	double base=10;
	double height=10;
	
	public Triangle(double base,double height)
	{
		this.base=base;
		this.height=height;
	}

public double getArea()
{
double area=(base*height)/2;
return area;

}
}
