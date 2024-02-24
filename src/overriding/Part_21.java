package overriding;

import java.io.EOFException;
import java.io.IOException;

class A15 {
	void m1() throws IOException {
		System.out.println("class 15");
	}
}

class A16 extends A15  {
	void m1() throws EOFException,InterruptedException {
		System.out.println("class 16");
	}
}

public class Part_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A15 ref = new A16();
		ref.m1();
	}

}
