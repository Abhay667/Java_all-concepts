package overriding;

class A21 {
	public void m1()

	{

		System.out.println("class A21 method m1");
	}
}

class A22 extends A21 {
	public static void m1() {
		System.out.println("class A22 method m1");
	}
}

public class Part_24 {

	public static void main(String[] args) {
		A21 ref = new A22();
		ref.m1();
	}

}
