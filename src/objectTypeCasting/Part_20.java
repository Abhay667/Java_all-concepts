package objectTypeCasting;

class S5 {
	void m1() {
		System.out.println("Super class m1 method");
	}

}

class P5 extends S5 {
	void m1() {
		System.out.println("Parent class, m1 method ");
	}
}

class C5 extends P5 {
	void m1() {
		System.out.println("Child class, m1 method");
	}
}

public class Part_20 {

	public static void main(String[] args) {
		C5 c = new C5();
	//((P5)c).m1();

		
	}

}
