package ExamplePkg;

public class Example2 {
	
	String name;
	int rollno;
	float fee;
	public Example2() {
	
		System.out.println("Students Info");
		
	}
	
	public Example2(int rollno,String name,float fee)
	{
		
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	
	
	public void display()
	{
		
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(fee);
	}
}
