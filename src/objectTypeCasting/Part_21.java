package objectTypeCasting;

class S6 {
	void m1() {
		System.out.println("Parent class, m1 method ");
	}
}

class P6 extends S6 {
	void m1() {
		System.out.println("Parent class, m1 method ");
	}
}

class C6 extends P6 {
	void m1() {
		System.out.println("Child class, m1 method");
	}
}

public class Part_21 {

	public static void main(String[] args) {

		C6 c = new C6();
		((S6) (P6) c).m1();
		/*
		 * it also meant :- S6 s = new C6(); s.m1();
		 */
	}

}
