package overriding;

class A53 {
	void m1() {
		System.out.println("Parent class");
	}
}

class A54 extends A53 {
	void m1() {
		System.out.println("Child class");
	}
}

public class Part_40 {

	public static void main(String[] args) {
		A53 p = new A54();
		p.m1();

	}

}
