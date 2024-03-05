package overriding;

class A37 {
	static int x = 9;

}

class A38 extends A37 {
	int x = 10;
}

public class Part_32 {

	public static void main(String[] args) {
		A37 parentRefer = new A37();
		// parentRefer.x;
		System.out.println(parentRefer.x);
		System.out.println("--------------------------");
		A38 childRefer = new A38();
		System.out.println(childRefer.x);
		System.out.println("--------------------------");
		A37 parentRefer2 = new A38();
		System.out.println(parentRefer2.x);
	}

}
