package objectTypeCasting;

class P2 {
	void m1() {
		System.out.println("parent class method");
	}
}

class C2 extends P2 {
	void m2() {
		System.out.println("child class method");
	}
}

public class Part_17 {

	public static void main(String[] args) {
		C2 c = new C2();

		P2 obj = new P2();
		obj = ((P2) c);
		obj.m1();
	}

}
