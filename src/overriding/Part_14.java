package overriding;

class A1 {
	public void m1() {
		System.out.println("public method of class A1 ");
	}
}

class A2 extends A1 {
	void m1() {
		System.out.println("default method of class A2 ");
	}
}

public class Part_14 {

	static void main(String[] args) {
		A1 a = new A2();
		a.m1();
	}

}
