package method_signature;

class A {
	void m1(int x) {
		System.out.println(x + x);
	}

	int m1(int j) {
		System.out.println(j);
		return j;
	}
}

public class Type_2 {

	public static void main(String[] args) {
		A a = new A();
		a.m1(10);

	}

}
