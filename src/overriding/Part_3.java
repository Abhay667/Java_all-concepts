package overriding;

class A {
	void sum(int a, int b) {
		System.out.println("Sum "+a + b +" of class A");
	}
}

class B extends A {
	void sum(int a, int b) {
		System.out.println("Sum, "+a + b +" of class B");
	}

}

public class Part_3 {

	public static void main(String[] args) {
		A RefP = new A();
	RefP.sum(5, 10);

	}

}
