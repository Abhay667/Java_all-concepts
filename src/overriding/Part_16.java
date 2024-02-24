package overriding;

class A5 {
	void m1() throws Exception {
		System.out.println("method of the class A5");

	}
}

class A6 extends A5

{
	void m1() {
		System.out.println("method of the class A6");

	}

}

public class Part_16 {

	public static void main(String[] args) {
		A5 ref = new A6();
		ref.m1();
	}

}
