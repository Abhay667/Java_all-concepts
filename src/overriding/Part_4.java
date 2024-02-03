package overriding;

class C {
	void sum(int a, int b) {
		System.out.println("Sum " + a + b + " of class C");
	}
}

class D extends C {
	void sum(int a, int b) {
		System.out.println("Sum, " + a + b + " of class D");
	}

}

public class Part_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D RefC = new D();
		RefC.sum(10, 5);
	}

}
