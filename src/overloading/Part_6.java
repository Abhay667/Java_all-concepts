package overloading;

class D {
	void m1(String s) {
		System.out.println("string");
	}

	void m1(StringBuffer s) {
		System.out.println("String buffer");
	}
}

public class Part_6 {
	public static void main(String[] args) {
		D b = new D();
		b.m1("hi");
		StringBuffer s1 = new StringBuffer();
		b.m1(s1);

	}

}
