package overriding;

import java.io.IOException;

class A43 {
	public void m1(int x) throws IOException {
		System.out.println("class A43");
	}
}

class A44 extends A43 {

	public void m1(int x) {
		System.out.println("class A44");
	}
}

public class Part_35 {

	public static void main(String[] args) {
		A43 ref = new A44();
		try {
			ref.m1(7);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
