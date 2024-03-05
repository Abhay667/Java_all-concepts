package overriding;

import java.io.IOException;

class A49 {
	public void m1(int x) throws IOException {
		System.out.println("class A49");
	}
}

class A50 extends A49 {
	public void m1(int x) throws Exception {
		System.out.println("class A49");
	}
}

public class Part_38 {

	public static void main(String[] args) throws IOException {
		A49 ref = new A50();
		ref.m1(0);

	}

}
