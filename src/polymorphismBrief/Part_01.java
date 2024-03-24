package polymorphismBrief;

class P1 {
	void m1() {
		System.out.println("parent class method");
	}
}

class C1 {
	void m1() {
		System.out.println("Child class method");
	}
}

public class Part_01 {

	public static void main(String[] args) {
		C1 c = new C1();
		c.m1();

	}

}
