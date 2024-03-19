package objectTypeCasting;

class P1 {
	void m1() {
		System.out.println("Parent class m1 method");
	}
}

class C1 extends P1 {
	void m2() {
		System.out.println("Child class, method m2");
	}

}

public class Part_16 {

	public static void main(String[] args) {
		C1 c = new C1();
		((P1) c).m1();

	}

}
