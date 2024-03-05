package overriding;

import java.io.IOException;

class A47 {
	public void m1(int x)throws IOException {
		System.out.println("class A47");
	}
}

class A48 extends A47 {
	public static void m1(int x) {
		System.out.println("class A48");
	}

}

public class Part_37 {

	public static void main(String[] args) throws IOException {
		A47 ref = new A48();
		ref.m1(0);

	}

}
