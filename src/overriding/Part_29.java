package overriding;

class A31 {
	int y = 0;

	void m1(int... num) {
		for (int x : num) {
			y = y + x;

		}
		System.out.println(y);
		System.out.println("A31 class var arg method");
		System.out.println("---------------------------------");
	}
}

class A32 extends A31 {

	void m1(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
		System.out.println("A32 class simple  method");
		System.out.println("---------------------------------");
	}

}

public class Part_29 {

	public static void main(String[] args) {
		A31 parentReference = new A31();
		parentReference.m1(2, 9, 9, 0);
		A32 childReference = new A32();
		childReference.m1(1, 2);
		A31 ref = new A32();
		ref.m1(1, 2, 3, 4, 5, 6);

	}

}
