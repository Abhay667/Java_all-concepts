package overloading;

public class Part_2 {

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void sum(float a, int b) {
		System.out.println(a + b);
	}

	void sum(float a, float b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		Part_2 obj = new Part_2();
		obj.sum(10, 5);
		obj.sum(10, 0, 5);
		obj.sum(10.0f, 5);
		obj.sum(10.0f, 05.0f);
	}

}
