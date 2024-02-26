package overriding;

class A33 {
	void m1(int... num) {
		System.out.println("class A33 ");
		System.out.println("---------------------");
	}

}

class A34 extends A33 {
	void m1(int... num) {
		System.out.println("class A34");
		System.out.println("---------------------");
	}
}

public class Part_30 {

	public static void main(String[] args) {

		A33 parentClassObject = new A33();
		parentClassObject.m1(9);
		A34 childClassObject = new A34();
		childClassObject.m1(9);
		A33 childClassObject2 = new A34();
		childClassObject2.m1(9);
	}

}
