package overriding;

class A19 {
	public static void m1() {
		System.out.println("class 19 method m1");
	}

}

class A20 extends A19 {
	public void m1() {
		System.out.println("class A20 method m1");
	}

}

public class Part_23 {

	public static void main(String[] args) {
		A19 ref = new A20();
		ref.m1();
	}

}
