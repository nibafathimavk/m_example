package ExamplePkg;

public class Example {
String name;
int age;
public Example()
{
	this("check");
	System.out.println("default");
}
public Example(String name)
{
	this(1,"abc");
	System.out.println("paramconst");
}
public Example(int id, String school)
{
	System.out.println("param const with 2 arg");
}
	public static void main(String[] args) {
	
		
		Example t=new Example();
		Example s=new Example();
		t.name="Anu";
		t.age=27;
		t.displayName();
		
	}
	public void displayName()
	{
		String name="Sara";
		System.out.println("Name of the current object is "+this.name);
		this.displayAge();
	}
	public void displayAge()
	{
		System.out.println("Age of the current object is "+age);
	}
}
