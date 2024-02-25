package overriding;

import java.io.EOFException;
import java.io.IOException;

class A17 {
	void m1() throws IOException {
		System.out.println("class A17 method m1");
	}
}

class A18 extends A17 {
	void m1() throws EOFException, InterruptedException {
		System.out.println("class A8 method m1");
	}

}

public class Part_22 {

	public static void main(String[] args) {
		A17 ref = new A18();
		ref.m1();
	}

}
