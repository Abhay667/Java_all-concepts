package objectTypeCasting;

class S7 {
	static void m1() {
		System.out.println(" Super class method");
	}
}

class P7 extends S7 {
	static void m1() {
		System.out.println(" Parent class method");
	}

}

class C7 extends P7 {
	static void m1() {
		System.out.println(" Child class method");
	}
}

public class Part_22 {

	public static void main(String[] args) {
		C7 c = new C7();
		c.m1();

	}

}
