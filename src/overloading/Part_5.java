package overloading;

class C {
	void m1(String s) {
		System.out.println("String type");
	}

	void m1(Object o) {
		System.out.println("Object type");
	}
}

public class Part_5 {

	public static void main(String[] args) {
		C c1 = new C();
		C c = new C();
		c.m1("hi hello");
		c.m1(c1);
		c.m1(null);
	}

}
