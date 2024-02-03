package overriding;

class E {
	void sum(int a, int b) {
		System.out.println("Sum " + a + b + " of class E");
	}
}

class F extends E {
	void sum(int a, int b) {
		System.out.println("Sum " + a + b + " of class F");
	}
}

public class Part_5 {

	public static void main(String[] args) {
		E RefP = new F();
		RefP.sum(10, 5);

	}

}
