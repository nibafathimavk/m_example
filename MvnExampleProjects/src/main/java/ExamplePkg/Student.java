package ExamplePkg;

public class Student {
	int rollno;  
	String name;  
	float fee;  
	
	Student(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
	  
	public static void main(String[] args) {
		
		Student s1=new Student(111,"ankit",5000f);  
				s1.display();  
		
		}
	}


