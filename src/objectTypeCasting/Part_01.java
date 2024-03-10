package objectTypeCasting;

class A1 {
	void m1() {
		System.out.println("class A1, parent class method");
	}
}

class A2 extends A1 {
	void m1()

	{
		System.out.println("class A2 child class method");
	}
}

public class Part_01 {

	public static void main(String[] args) {
		A1 ParentRefer = new A1();
		ParentRefer.m1();

	}

}
