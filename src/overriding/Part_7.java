package overriding;

abstract class M {
	abstract void m1();

}

class N extends M {
	void m1() {
		System.out.println("overriden abstract method");
	}
}

public class Part_7 {

	public static void main(String[] args) {
		M n = new N();
		n.m1();

	}

}
