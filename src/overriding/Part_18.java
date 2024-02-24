package overriding;

import java.io.IOException;

class A9 {
	void m1() throws Exception {
		System.out.println("class A9");
	}
}

class A10 extends A9 {
	void m1() throws IOException {
		System.out.println("A10");

	}
}

public class Part_18 {

	public static void main(String[] args) {
		A9 ref = new A10();
		ref.m1();
	}

}
