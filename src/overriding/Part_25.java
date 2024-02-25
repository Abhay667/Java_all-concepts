package overriding;

class A23 {
	public static void m1() {
		System.out.println("class A23 method m1");
	}
}

class A24 extends A23 {
	public static void m1() {
		System.out.println("class A24 method m1");
	}
}

public class Part_25 {

	public static void main(String[] args) {
		A23 ref = new A23();
		ref.m1();
	}

}
