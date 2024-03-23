package objectTypeCasting;

class S9 {
	static void m1() {
		System.out.println(" Super class method");
	}
}

class P9 extends S9 {
	static void m1() {
		System.out.println(" Parent class method ");
	}
}

class C9 extends P9 {
	static void m1() {
		System.out.println(" Child class method");
	}
}

public class Part_24 {

	public static void main(String[] args) {
		C9 c = new C9();
		//S9,P9,c,m1
		((S9)(P9)c).m1();
		
	}

}
