package objectTypeCasting;
class P4 {
	void m1() {
		System.out.println("parent class method");
	}
}

class C4 extends P4 {
	void m2() {
		System.out.println("child class method");
	}
}

public class Part_19 {

	public static void main(String[] args) {
		C4 c = new C4();
		((P)c).m2();
//		P4 p = new C4();
//		p.m2();

	}

}
