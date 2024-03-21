package overriding;

class A55 {
	void m1() {
		System.out.println("Parent class method m1");
	}
}

class A56 extends A55 {

}

public class Part_41 {

	public static void main(String[] args) {
		A55 ref = new A56();
		ref.m1();
	}

}
