package overriding;

class A {
	void m1() { 
		System.out.println(" A class method");

	}
}

class B extends A {
	void m1()

	{
		System.out.println(" B class method");

	}
}

public class Part_1 {

	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}

}
