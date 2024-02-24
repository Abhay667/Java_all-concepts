package overriding;

import java.io.IOException;

class A13 {
	void m1() throws IOException {
		System.out.println("class 12");
	}
}

class A14 extends A13 {
	void m1() throws Exception {
		System.out.println("class 13");
	}
}

public class Part_20 {

	public static void main(String[] args) {
	A13 ref = new A14();
	ref.m1();

	}

}
