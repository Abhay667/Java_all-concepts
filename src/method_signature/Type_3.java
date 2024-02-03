package method_signature;

class Test_ {
	void m1(int i) {
		System.out.println(i);
	}

	void m2(String s) {
		System.out.println(s);
	}
}

public class Type_3 {

	public static void main(String[] args) {
		Test_ t = new Test_();
		t.m1(10.5);

	}

}
