package overriding;

class K {
	final void m1() {
		System.out.println("final method");
	}
}

class L extends K {
	void m1() {
		System.out.println("non final method");
	}
}

public class Part_6 {

	public static void main(String[] args) {
		L l = new L();
		l.m1();

	}

}
