package preppkgTWO;

import PrepPackage.superKeyTry;

public class TestClassSuper extends superKeyTry{
int a;
	public static void main(String[] args) {
		TestClassSuper tcs=new TestClassSuper();
		tcs.a=10;
		tcs.display();
	}
	public void display() {
		int a=100;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println("child display method");
	}

}
