package overriding;

import java.io.IOException;

class A11 {
	void m1() throws Exception {
		System.out.println("class A11");
	}
}

class A12 extends A11 {
	void m1() throws IOException {
		System.out.println("A12");

	}
}

public class Part_19 {

	public static void main(String[] args) throws Exception {
		A11 ref = new A12();
		ref.m1();

	}

}
