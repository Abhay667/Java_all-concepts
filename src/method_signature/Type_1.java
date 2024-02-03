package method_signature;

class Test {
	void m1(int i) {
		System.out.println(i);
	}

	void m2(String s) {
		System.out.println(s);
	}
}

public class Type_1 {

	public static void main(String[] args) {
		Test t = new Test();
		t.m1(10);
		t.m2("Abhay");

	}

}
