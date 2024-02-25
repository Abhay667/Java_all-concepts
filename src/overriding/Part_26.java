package overriding;

class A25 {
	public void m1() {
		System.out.println("class A25 method m1");
	}
}

class A26 extends A25 {
	public void m1() {
		System.out.println("class A26 method m1");
	}
}

public class Part_26 {

	public static void main(String[] args) {
		A25 ref = new A26();
		ref.m1();
	}

}
