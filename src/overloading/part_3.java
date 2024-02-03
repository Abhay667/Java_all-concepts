package overloading;

class A {
	void m1(int a) {
		System.out.println("int ");
	}

	void m1(float a) {
		System.out.println("float");
	}

}

public class part_3 {

	public static void main(String[] args) {
		A a = new A();
		a.m1(10);
		a.m1(10.0f);
	}

}
