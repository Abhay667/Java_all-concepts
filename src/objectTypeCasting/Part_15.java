package objectTypeCasting;

class P {
	void m1() {
		System.out.println("Parent class m1 method");
	}
}

class C extends P {
	void m2() {
		System.out.println("Child class m2 method");

	}
}

public class Part_15 {

	public static void main(String[] args) {
//		
		C c = new C();
		c.m1();
		c.m2();
		//((P) c).m1();
	}

}
