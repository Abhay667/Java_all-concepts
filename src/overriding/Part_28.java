package overriding;

class A29 {
	void m1() {
		System.out.println("class A29 method m1");
	}
}

class A30 extends A29 {
	void m1() {
		System.out.println("class A30 method m1");
	}
}

public class Part_28 {

	public static void main(String[] args) {
		A30 childClassObject = new A30();
		childClassObject.m1();
		A29 parentClassObject = new A30();
		parentClassObject.m1();

	}

}
