package overriding;

class A27 {
	public static void m1() {
		System.out.println("class A27 m1 method");
	}
}

class A28 extends A27 {
	public static void m1() {
		System.out.println("class A28 m1 method");
	}
}

public class Part_27 {

	public static void main(String[] args) {
		A28 refOfChild = new A28();
		refOfChild.m1();

		A27 refOfParent = new A28();
		refOfParent.m1();
// both copies available for Child class object
	}

}
