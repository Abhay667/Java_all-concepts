package overloading;

class A {
	void m1(int x) {
		System.out.println("int");

	}

	void m1(int... x) {
		System.out.println("var arg method");
	}

}

public class Part_9 {

	public static void main(String[] args) {
		A a = new A();
		a.m1(10);

	}

}
