package overloading;

class A {
	void m1(int i, float f) {
		System.out.println(" int float combination");
	}

	void m1(float f, int i) {
		System.out.println(" float int combination");
	}

}

public class Part_8 {

	public static void main(String[] args) {
		A a = new A();
		a.m1(10, 10);
	}

}
