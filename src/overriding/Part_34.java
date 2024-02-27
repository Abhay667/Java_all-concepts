package overriding;


class A41 {
	 static int x = 9;

}

class A42 extends A41 {
	static int x = 10;
}

public class Part_34 {

	public static void main(String[] args) {
		A41 parentRefer = new A41();
		// parentRefer.x;
		System.out.println(parentRefer.x);
		System.out.println("--------------------------");
		A42 childRefer = new A42();
		System.out.println(childRefer.x);
		System.out.println("--------------------------");
		A41 parentRefer2 = new A42();
		System.out.println(parentRefer2.x);
	}

}
