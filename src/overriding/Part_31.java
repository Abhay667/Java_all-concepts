package overriding;

class A35 {
	int x = 9;

}

class A36 extends A35 {
	int x = 10;
}

public class Part_31 {

	public static void main(String[] args) {
		A35 parentRefer = new A35();
		// parentRefer.x;
		System.out.println(parentRefer.x);
		System.out.println("--------------------------");
		A36 childRefer = new A36();
		System.out.println(childRefer.x);
		System.out.println("--------------------------");
		A35 parentRefer2 = new A36();
		System.out.println(parentRefer2.x);
		

	}

}
