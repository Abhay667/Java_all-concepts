package overriding;

class A39 {
	int x = 9;

}

class A40 extends A39 {
	static int x = 10;
}

public class Part_33 {

	public static void main(String[] args) {
		A39 parentRefer = new A39();
		// parentRefer.x;
		System.out.println(parentRefer.x);
		System.out.println("--------------------------");
		A40 childRefer = new A40();
		System.out.println(childRefer.x);
		System.out.println("--------------------------");
		A39 parentRefer2 = new A40();
		System.out.println(parentRefer2.x);
	}

}
