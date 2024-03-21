package overriding;

class A59 {

}

class A60 extends A59 {
	void m1() {
		System.out.println("child class method");
	}
}

public class Part_43 {

	public static void main(String[] args) {
		A60 ref = new A60();
		ref.m1();

	}

}
