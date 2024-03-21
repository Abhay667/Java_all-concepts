package objectTypeCasting;

class P3 {
	void m1() {
		System.out.println("parent class method");
	}
}

class C3 extends P3 {
	void m2() {
		System.out.println("child class method");
	}
}

public class Part_18 {

	public static void main(String[] args) {
		// ((P1) c).m1();
		P3 p = new C3();
		p.m1();

	}

}
