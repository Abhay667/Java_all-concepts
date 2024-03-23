package objectTypeCasting;

class S8 {
	static void m1() {
		System.out.println(" Super class method");
	}
}

class P8 extends S8 {
	static void m1() {
		System.out.println(" Parent class method ");
	}
}

class C8 extends P8 {
	static void m1() {
		System.out.println(" Child class method");
	}
}

public class Part_23 {

	public static void main(String[] args) {
		C8 c = new C8();
		((P8) c).m1();

	}

}
