package overriding;

class A7 {
	void m1() {
		System.out.println("class A7");
	}
}

class A8 extends A7 {
	void m1() throws Exception {
		System.out.println("class A8");
	}
}

public class Part_17 {

	public static void main(String[] args) {
		A7 ref = new A8();
		ref.m1();

	}

}
